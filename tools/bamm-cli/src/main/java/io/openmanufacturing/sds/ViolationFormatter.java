/*
 * Copyright (c) 2022 Robert Bosch Manufacturing Solutions GmbH
 *
 * See the AUTHORS file(s) distributed with this work for additional
 * information regarding authorship.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package io.openmanufacturing.sds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.openmanufacturing.sds.aspectmodel.shacl.violation.InvalidSyntaxViolation;
import io.openmanufacturing.sds.aspectmodel.shacl.violation.ProcessingViolation;
import io.openmanufacturing.sds.aspectmodel.shacl.violation.Violation;

/**
 * Formats one or multiple {@link Violation}s in a human-readable way
 */
public class ViolationFormatter implements Function<List<Violation>, String>, Violation.Visitor<String> {
   @Override
   public String apply( final List<Violation> violations ) {
      final List<Violation> nonSemanticViolations = violations.stream().filter( violation ->
            violation.errorCode().equals( InvalidSyntaxViolation.ERROR_CODE ) || violation.errorCode().equals( ProcessingViolation.ERROR_CODE ) ).toList();
      if ( !nonSemanticViolations.isEmpty() ) {
         return processNonSemanticViolation( nonSemanticViolations );
      }

      return processSemanticViolations( violations );
   }

   private String processNonSemanticViolation( final List<Violation> violations ) {
      return violations.stream().map( violation -> violation.accept( this ) ).collect( Collectors.joining( "\n\n" ) );
   }

   private String processSemanticViolations( final List<Violation> violations ) {
      final Map<String, List<Violation>> violationsByElement = new HashMap<>();
      for ( final Violation violation : violations ) {
         final String elementName = violation.elementName();
         final List<Violation> elementViolations = violationsByElement.computeIfAbsent( elementName, ( element ) -> new ArrayList<>() );
         elementViolations.add( violation );
      }

      final StringBuilder builder = new StringBuilder();
      builder.append( String.format( "Semantic violations were found:%n%n" ) );
      for ( final Map.Entry<String, List<Violation>> entry : violationsByElement.entrySet() ) {
         final String elementName = entry.getKey();
         final List<Violation> elementViolations = entry.getValue();
         builder.append( String.format( "> %s:%n", elementName ) );
         for ( final Violation violation : elementViolations ) {
            builder.append( String.format( "  %s%n", violation.accept( this ) ) );
         }
         builder.append( String.format( "%n" ) );
      }

      return builder.toString();
   }

   /**
    * Default formatting for most violations
    * @param violation the violation
    * @return formatted representation
    */
   @Override
   public String visit( final Violation violation ) {
      return violation.message();
   }

   /**
    * Processing violation, e.g. a model element that could not be resolved
    * @param violation the violation
    * @return formatted representation
    */
   @Override
   public String visitProcessingViolation( final ProcessingViolation violation ) {
      return String.format( "Semantic validation could not be started:%n%s%n", violation.message() );
   }

   /**
    * Syntax error in the source file
    * @param violation the violation
    * @return formatted representation
    */
   @Override
   public String visitInvalidSyntaxViolation( final InvalidSyntaxViolation violation ) {
      final String[] lines = violation.source().split( "\n" );
      final String highlightedSource = IntStream.range( 0, lines.length )
            .mapToObj( i -> String.format( "%2s%3d: %s\n", (i + 1 == violation.line() ? "->" : ""), i + 1, lines[i] ) )
            .collect( Collectors.joining() );
      return String.format( "Syntax error in line %d, column %d: %s%n%n%s%n", violation.line(), violation.column(), violation.message(), highlightedSource );
   }
}
