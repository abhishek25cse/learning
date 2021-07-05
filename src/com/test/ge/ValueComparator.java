package com.test.ge;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Map.Entry<String, NeighbourFrequencyList> entry1 = (Map.Entry<String, NeighbourFrequencyList> )o1;
		Map.Entry<String, NeighbourFrequencyList> entry2 = (Map.Entry<String, NeighbourFrequencyList> )o2;		
		return entry2.getValue().getOccurred() - entry1.getValue().getOccurred();
	}

}
