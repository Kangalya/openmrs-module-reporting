/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.evaluation.parameter;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.module.reporting.cohort.definition.AgeCohortDefinition;
import org.openmrs.module.reporting.cohort.definition.toreview.DrugOrderCohortDefinition;
import org.openmrs.module.reporting.common.DurationUnit;
import org.openmrs.module.reporting.definition.DefinitionUtil;
import org.openmrs.module.reporting.definition.configuration.Property;

/**
 * Tests the ParameterUtil methods
 */
public class ParameterUtilTest {
	
	/**
	 * Tests that fields annotated as {@link EvalProperty} are added as Parameters
	 */
	@Test
	public void shouldHaveAllAnnotatedFieldsAsParameters() throws Exception {		
		AgeCohortDefinition def = new AgeCohortDefinition();
		List<Property> props = DefinitionUtil.getConfigurationProperties(def);
		Assert.assertEquals(6, props.size());
		for (Property p : props) {
			if (p.getField().getName().equals("minAgeUnit")) {
				Assert.assertEquals(DurationUnit.YEARS, p.getValue());
			}
		}
	}
	
	/**
	 * Tests that fields annotated as {@link EvalProperty} are added as Parameters from superclasses
	 */
	@Test
	public void shouldHaveAllInheritedAnnotatedFieldsAsParameters() throws Exception {		
		DrugOrderCohortDefinition def = new DrugOrderCohortDefinition();
		System.out.println(DefinitionUtil.getConfigurationProperties(def));
		Assert.assertEquals(9, DefinitionUtil.getConfigurationProperties(def).size());
	}
}
