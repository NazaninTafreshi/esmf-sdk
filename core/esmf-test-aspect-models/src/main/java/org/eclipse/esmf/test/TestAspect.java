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

package org.eclipse.esmf.test;

import org.apache.commons.text.CaseUtils;

public enum TestAspect implements TestModel {
   ASPECT,
   ASPECT_WITHOUT_LANGUAGE_TAGS,
   ASPECT_WITHOUT_PROPERTIES_AND_OPERATIONS,
   ASPECT_WITHOUT_SEE_ATTRIBUTE,
   ASPECT_WITH_ABSTRACT_ENTITY,
   ASPECT_WITH_ABSTRACT_PROPERTY,
   ASPECT_WITH_ABSTRACT_SINGLE_ENTITY,
   ASPECT_WITH_ALL_BASE_ATTRIBUTES,
   ASPECT_WITH_BINARY,
   ASPECT_WITH_BLANK_NODE,
   ASPECT_WITH_BOOLEAN,
   ASPECT_WITH_CHARACTERISTIC_WITHOUT_SEE_ATTRIBUTE,
   ASPECT_WITH_CHARACTERISTIC_WITH_MULTIPLE_SEE_ATTRIBUTES,
   ASPECT_WITH_CHARACTERISTIC_WITH_SEE_ATTRIBUTE,
   ASPECT_WITH_CODE,
   ASPECT_WITH_COLLECTION,
   ASPECT_WITH_COLLECTIONS,
   ASPECT_WITH_COLLECTIONS_WITH_ELEMENT_CHARACTERISTIC_AND_SIMPLE_DATA_TYPE,
   ASPECT_WITH_COLLECTION_AND_ELEMENT_CHARACTERISTIC,
   ASPECT_WITH_COLLECTION_AND_SIMPLE_ELEMENT_CHARACTERISTIC,
   ASPECT_WITH_COLLECTION_OF_SIMPLE_TYPE,
   ASPECT_WITH_COLLECTION_WITHOUT_SEE_ATTRIBUTE,
   ASPECT_WITH_COLLECTION_WITH_ABSTRACT_ENTITY,
   ASPECT_WITH_COLLECTION_WITH_ELEMENT_CHARACTERISTIC,
   ASPECT_WITH_COLLECTION_WITH_ELEMENT_CONSTRAINT,
   ASPECT_WITH_COLLECTION_WITH_MULTIPLE_SEE_ATTRIBUTES,
   ASPECT_WITH_COLLECTION_WITH_SEE_ATTRIBUTE,
   ASPECT_WITH_COMPLEX_COLLECTION_ENUM,
   ASPECT_WITH_COMPLEX_ENTITY_COLLECTION_ENUM,
   ASPECT_WITH_COMPLEX_ENUM,
   ASPECT_WITH_COMPLEX_ENUM_INCL_OPTIONAL,
   ASPECT_WITH_CONSTRAINED_COLLECTION,
   ASPECT_WITH_CONSTRAINT,
   ASPECT_WITH_CONSTRAINTS,
   ASPECT_WITH_CONSTRAINT_WITHOUT_SEE_ATTRIBUTE,
   ASPECT_WITH_CONSTRAINT_WITH_MULTIPLE_SEE_ATTRIBUTES,
   ASPECT_WITH_CONSTRAINT_WITH_SEE_ATTRIBUTE,
   ASPECT_WITH_CURIE,
   ASPECT_WITH_CURIE_ENUMERATION,
   ASPECT_WITH_CUSTOM_NAMESPACE,
   ASPECT_WITH_CUSTOM_UNIT,
   ASPECT_WITH_DATE_TIME_TYPE_FOR_RANGE_CONSTRAINTS,
   ASPECT_WITH_DESCRIPTIONS,
   ASPECT_WITH_DESCRIPTION_IN_PROPERTY,
   ASPECT_WITH_DURATION,
   ASPECT_WITH_DURATION_TYPE_FOR_RANGE_CONSTRAINTS,
   ASPECT_WITH_EITHER,
   ASPECT_WITH_EITHER_WITHOUT_SEE_ATTRIBUTE,
   ASPECT_WITH_EITHER_WITH_COMPLEX_TYPES,
   ASPECT_WITH_EITHER_WITH_MULTIPLE_SEE_ATTRIBUTES,
   ASPECT_WITH_EITHER_WITH_SEE_ATTRIBUTE,
   ASPECT_WITH_ENCODED_STRINGS,
   ASPECT_WITH_ENCODING_CONSTRAINT,
   ASPECT_WITH_ENGLISH_AND_GERMAN_DESCRIPTION,
   ASPECT_WITH_ENGLISH_DESCRIPTION,
   ASPECT_WITH_ENTITY,
   ASPECT_WITH_ENTITY_COLLECTION,
   ASPECT_WITH_ENTITY_ENUMERATION,
   ASPECT_WITH_ENTITY_ENUMERATION_AND_LANG_STRING,
   ASPECT_WITH_ENTITY_ENUMERATION_AND_NOT_IN_PAYLOAD_PROPERTIES,
   ASPECT_WITH_ENTITY_ENUMERATION_WITH_NOT_EXISTING_ENUM,
   ASPECT_WITH_ENTITY_ENUMERATION_WITH_OPTIONAL_AND_NOT_IN_PAYLOAD_PROPERTIES,
   ASPECT_WITH_ENTITY_INSTANCE_WITH_NESTED_ENTITY_LIST_PROPERTY,
   ASPECT_WITH_ENTITY_INSTANCE_WITH_NESTED_ENTITY_PROPERTY,
   ASPECT_WITH_ENTITY_INSTANCE_WITH_SCALAR_LIST_PROPERTY,
   ASPECT_WITH_ENTITY_INSTANCE_WITH_SCALAR_PROPERTIES,
   ASPECT_WITH_ENTITY_LIST,
   ASPECT_WITH_ENTITY_WITHOUT_PROPERTY,
   ASPECT_WITH_ENTITY_WITH_MULTIPLE_PROPERTIES,
   ASPECT_WITH_ENUMERATION,
   ASPECT_WITH_ENUMERATION_WITHOUT_SCALAR_VARIABLE,
   ASPECT_WITH_ENUMERATION_WITHOUT_SEE_ATTRIBUTE,
   ASPECT_WITH_ENUMERATION_WITH_MULTIPLE_SEE_ATTRIBUTES,
   ASPECT_WITH_ENUMERATION_WITH_SCALAR_VARIABLE,
   ASPECT_WITH_ENUMERATION_WITH_SEE_ATTRIBUTE,
   ASPECT_WITH_ENUM_AND_OPTIONAL_ENUM_PROPERTIES,
   ASPECT_WITH_ENUM_HAVING_NESTED_ENTITIES,
   ASPECT_WITH_ERROR_COLLECTION,
   ASPECT_WITH_EVENT,
   ASPECT_WITH_EXCLUSIVE_RANGE_CONSTRAINT,
   ASPECT_WITH_EXTENDED_ENTITY,
   ASPECT_WITH_EXTENDED_ENUMS,
   ASPECT_WITH_EXTENDED_ENUMS_WITH_NOT_IN_PAYLOAD_PROPERTY,
   ASPECT_WITH_FIXED_POINT,
   ASPECT_WITH_FIXED_POINT_CONSTRAINT,
   ASPECT_WITH_G_TYPE_FOR_RANGE_CONSTRAINTS,
   ASPECT_WITH_HTML_TAGS,
   ASPECT_WITH_LANGUAGE_CONSTRAINT,
   ASPECT_WITH_LENGTH_CONSTRAINT,
   ASPECT_WITH_LIST,
   ASPECT_WITH_LIST_AND_ADDITIONAL_PROPERTY,
   ASPECT_WITH_LIST_AND_ELEMENT_CHARACTERISTIC,
   ASPECT_WITH_LIST_AND_ELEMENT_CONSTRAINT,
   ASPECT_WITH_LIST_ENTITY_ENUMERATION,
   ASPECT_WITH_LIST_WITH_LENGTH_CONSTRAINT,
   ASPECT_WITH_MEASUREMENT,
   ASPECT_WITH_MEASUREMENT_WITH_UNIT,
   ASPECT_WITH_MULTIPLE_COLLECTIONS_OF_SIMPLE_TYPE,
   ASPECT_WITH_MULTIPLE_ENTITIES,
   ASPECT_WITH_MULTIPLE_ENTITIES_AND_EITHER,
   ASPECT_WITH_MULTIPLE_ENTITIES_ON_MULTIPLE_LEVELS,
   ASPECT_WITH_MULTIPLE_ENTITY_COLLECTIONS,
   ASPECT_WITH_MULTIPLE_ENUMERATIONS_ON_MULTIPLE_LEVELS,
   ASPECT_WITH_MULTIPLE_SEE_ATTRIBUTES,
   ASPECT_WITH_MULTI_LANGUAGE_TEXT,
   ASPECT_WITH_NESTED_ENTITY,
   ASPECT_WITH_NESTED_ENTITY_ENUMERATION_WITH_NOT_IN_PAYLOAD,
   ASPECT_WITH_NESTED_ENTITY_LIST_ENUMERATION_WITH_NOT_IN_PAYLOAD,
   ASPECT_WITH_NUMERIC_REGULAR_EXPRESSION_CONSTRAINT,
   ASPECT_WITH_NUMERIC_STRUCTURED_VALUE,
   ASPECT_WITH_OPERATION,
   ASPECT_WITH_OPERATION_WITHOUT_SEE_ATTRIBUTE,
   ASPECT_WITH_OPERATION_WITH_MULTIPLE_SEE_ATTRIBUTES,
   ASPECT_WITH_OPERATION_WITH_SEE_ATTRIBUTE,
   ASPECT_WITH_OPTIONAL_PROPERTIES,
   ASPECT_WITH_OPTIONAL_PROPERTIES_WITH_ENTITY,
   ASPECT_WITH_OPTIONAL_PROPERTY,
   ASPECT_WITH_OPTIONAL_PROPERTY_AND_CONSTRAINT,
   ASPECT_WITH_OPTIONAL_PROPERTY_WITH_PAYLOAD_NAME,
   ASPECT_WITH_PREFERRED_NAMES,
   ASPECT_WITH_PROPERTY,
   ASPECT_WITH_PROPERTY_WITH_ALL_BASE_ATTRIBUTES,
   ASPECT_WITH_PROPERTY_WITH_DESCRIPTIONS,
   ASPECT_WITH_PROPERTY_WITH_PAYLOAD_NAME,
   ASPECT_WITH_PROPERTY_WITH_PREFERRED_NAMES,
   ASPECT_WITH_PROPERTY_WITH_SEE,
   ASPECT_WITH_QUANTIFIABLE_AND_UNIT,
   ASPECT_WITH_QUANTIFIABLE_WITHOUT_UNIT,
   ASPECT_WITH_QUANTIFIABLE_WITH_UNIT,
   ASPECT_WITH_RANGE_CONSTRAINT,
   ASPECT_WITH_RANGE_CONSTRAINT_INCL_BOUND_DEFINITION_PROPERTIES,
   ASPECT_WITH_RANGE_CONSTRAINT_ON_CONSTRAINED_NUMERIC_TYPE,
   ASPECT_WITH_RANGE_CONSTRAINT_WITHOUT_MIN_MAX_DOUBLE_VALUE,
   ASPECT_WITH_RANGE_CONSTRAINT_WITHOUT_MIN_MAX_INTEGER_VALUE,
   ASPECT_WITH_RANGE_CONSTRAINT_WITH_BOUND_DEFINITION_ATTRIBUTES,
   ASPECT_WITH_RANGE_CONSTRAINT_WITH_ONLY_LOWER_BOUND,
   ASPECT_WITH_RANGE_CONSTRAINT_WITH_ONLY_LOWER_BOUND_DEFINITION_AND_BOTH_VALUES,
   ASPECT_WITH_RANGE_CONSTRAINT_WITH_ONLY_LOWER_BOUND_INCL_BOUND_DEFINITION,
   ASPECT_WITH_RANGE_CONSTRAINT_WITH_ONLY_MIN_VALUE,
   ASPECT_WITH_RANGE_CONSTRAINT_WITH_ONLY_UPPER_BOUND,
   ASPECT_WITH_RANGE_CONSTRAINT_WITH_ONLY_UPPER_BOUND_INCL_BOUND_DEFINITION,
   ASPECT_WITH_RECURSIVE_PROPERTY_WITH_OPTIONAL,
   ASPECT_WITH_REGULAR_EXPRESSION_CONSTRAINT,
   ASPECT_WITH_RUBY_GEM_UPDATE_COMMAND,
   ASPECT_WITH_SCRIPT_TAGS,
   ASPECT_WITH_SEE,
   ASPECT_WITH_SEE_ATTRIBUTE,
   ASPECT_WITH_SET,
   ASPECT_WITH_SIMPLE_ENTITY,
   ASPECT_WITH_SIMPLE_PROPERTIES,
   ASPECT_WITH_SIMPLE_PROPERTIES_AND_STATE,
   ASPECT_WITH_SIMPLE_TYPES,
   ASPECT_WITH_SORTED_SET,
   ASPECT_WITH_STATE,
   ASPECT_WITH_STRING_ENUMERATION,
   ASPECT_WITH_STRUCTURED_VALUE,
   ASPECT_WITH_TIME_SERIES,
   ASPECT_WITH_TWO_LISTS,
   ASPECT_WITH_UNIT,
   ASPECT_WITH_USED_AND_UNUSED_CHARACTERISTIC,
   ASPECT_WITH_USED_AND_UNUSED_COLLECTION,
   ASPECT_WITH_USED_AND_UNUSED_CONSTRAINT,
   ASPECT_WITH_USED_AND_UNUSED_EITHER,
   ASPECT_WITH_USED_AND_UNUSED_ENUMERATION,
   ENTITY_INSTANCE_TEST1,
   ENTITY_INSTANCE_TEST2,
   ENTITY_INSTANCE_TEST3,
   ENTITY_INSTANCE_TEST4,
   ASPECT_WITH_ENUM_ONLY_ONE_SEE,
   MOVEMENT,

   MODEL_WITH_CYCLES,
   MODEL_WITH_BROKEN_CYCLES,

   MODEL_WITH_BLANK_AND_ADDITIONAL_NODES;

   @Override
   public String getName() {
      return CaseUtils.toCamelCase( toString().toLowerCase(), true, '_' );
   }
}
