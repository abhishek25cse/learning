package com.test.ge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {
	/*
	 * word in descending of frequency , display
	 * 
	 * 
	 * this is a test for test and test it in Ec
	 * 
	 * test 3 {for, and, it}
	 * 
	 * 1. sort the word in order of frequency 2. linked list for the next word,
	 * 
	 */

	public static void main(String[] args) {
		String line = "this is a test for test and test it in Ec";
		System.out.println(line);
		HashMap<String, NeighbourFrequencyList> resposne = Test1.calculateFrequency(line);		
		resposne = Test1.sortMap(resposne);
		
		for(Map.Entry<String, NeighbourFrequencyList> entry : resposne.entrySet()) {
			System.out.println("\n *******"+entry.getKey()+"*******"+"\n \t    "+entry.getValue());
		}
	}

	public static HashMap<String, NeighbourFrequencyList> calculateFrequency(String line) {
		HashMap<String, NeighbourFrequencyList> response = new HashMap<String, NeighbourFrequencyList>();
		String[] words = line.split(" ");

		if (null == line || line.isEmpty()) {
			return response;
		}

		for (int i = 0; i < words.length; i++) {

			if (response.containsKey(words[i])) {
				response.get(words[i]).setOccurred(response.get(words[i]).getOccurred() + 1);

				if (i != (words.length - 1) && (!words[i].equalsIgnoreCase(words[i + 1]))) {
					response.get(words[i]).getWords().add(words[i + 1]);
				}
			} else {
				NeighbourFrequencyList n = new NeighbourFrequencyList();
				n.setOccurred(1);
				List<String> next = new ArrayList<String>();
				if (i < words.length - 1) {
					next.add(words[i + 1]);
				}
				n.setWords(next);
				response.put(words[i], n);
			}
		}

		return response;

	}

	public static LinkedHashMap<String, NeighbourFrequencyList> sortMap(HashMap<String, NeighbourFrequencyList> response){
		ArrayList<Map.Entry<String, NeighbourFrequencyList>> entrys = new ArrayList<Map.Entry<String, NeighbourFrequencyList>>();		
		LinkedHashMap<String, NeighbourFrequencyList> sortedResponse = new LinkedHashMap<String, NeighbourFrequencyList> ();		
		for(Map.Entry<String, NeighbourFrequencyList> e : response.entrySet()) {
			entrys.add(e);
		}			
		Collections.sort(entrys, new ValueComparator());		
		for(Map.Entry<String, NeighbourFrequencyList> sortedE :entrys) {
			sortedResponse.put(sortedE.getKey(), sortedE.getValue());
		}		
		return sortedResponse;
	}
}


// architecture
/* 
 * next round will be architecture
 *technical concept
 *spring boot 
 *threading synchronous
 *testing BDD, cucumber ,
 * feature file integration test
 * 
 * design pattern -- creational , behaviour
 * micro service -- orchestor, api, zoolkeeper, eureka, api gateway
 * hystrix , 
 */

