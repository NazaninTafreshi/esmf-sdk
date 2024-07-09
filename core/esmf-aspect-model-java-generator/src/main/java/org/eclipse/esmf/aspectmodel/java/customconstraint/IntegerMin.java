/*
 * Copyright (c) 2023 Robert Bosch Manufacturing Solutions GmbH
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

package org.eclipse.esmf.aspectmodel.java.customconstraint;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.eclipse.esmf.metamodel.BoundDefinition;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target( { FIELD, TYPE_USE } )
@Retention( RUNTIME )
@Constraint( validatedBy = IntegerMinValidator.class )
public @interface IntegerMin {

   String message() default "{org.eclipse.esmf.aspectmodel.java.customconstraint.message}";

   Class<?>[] groups() default {};

   Class<? extends Payload>[] payload() default {};

   /**
    * @return value the element must be higher or equal to
    */
   int value();

   /**
    * The definition used to determine whether the given {@link #value()} is inclusive or exclusive.
    */
   BoundDefinition boundDefinition();
}
