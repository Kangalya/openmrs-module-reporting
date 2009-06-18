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
package org.openmrs.module.indicator.aggregation;

import java.util.Collection;
import java.util.List;

/**
 * Returns the Max value of the passed objects, throwing a RuntimeException if the 
 * passed list is null or non-numeric.
 * TODO: How do we handle nulls here?
 * TODO: Can we delegate this computation to a well-tested 3rd party library?
 */
public class MaxAggregator implements Aggregator {
	
	public MaxAggregator() {}
	
	public String getName() { 
		return "MAX";
	}
	
	public Number compute(Collection<Number> values) {
		if (values == null || values.isEmpty()) {
			throw new RuntimeException("Unable to compute a mean value of a null or empty collection");
		}
		List<Number> valueList = AggregationUtil.sortNumbers(values, true);
		return valueList.get(valueList.size()-1);
	}
}
