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

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import org.apache.jena.rdf.model.Model;

import io.openmanufacturing.sds.aspectmodel.resolver.ResolutionStrategy;
import io.openmanufacturing.sds.aspectmodel.resolver.services.TurtleLoader;
import io.openmanufacturing.sds.aspectmodel.urn.AspectModelUrn;
import io.vavr.control.Try;

// Specialized resolution strategy: use external resolver to resolve the URNs passed as argument into models.
class ExternalResolverStrategy implements ResolutionStrategy {

   private final String command;

   ExternalResolverStrategy( final String command ) {
      this.command = command;
   }

   @Override
   public Try<Model> apply( final AspectModelUrn aspectModelUrn ) {
      final String commandWithParameters = command + " " + aspectModelUrn.toString();
      final String result = CommandExecutor.executeCommand( commandWithParameters );
      return TurtleLoader.loadTurtle( new ByteArrayInputStream( result.getBytes( StandardCharsets.UTF_8 ) ) );
   }
}
