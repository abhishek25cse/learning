package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DivideRepeatNumbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideRepeatNumbr.divide(229, 990);
		System.out.println(DivideRepeatNumbr.perfectSubstring("1", 1));
	}

	public static int perfectSubstring(String s, int k) {
		if (null == s || s.isEmpty()) {
			return 0;
		}
		if (k == 1) {
			return s.length();
		}
		int count = 0;
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length() - 1; i++) {
			countMap.clear();
			countMap.put(s.charAt(i), 1);
			for (int j = i + 1; j < s.length(); j++) {
				if (countMap.containsKey(s.charAt(j))) {
					countMap.put(s.charAt(j), countMap.get(s.charAt(j)) + 1);
				} else {
					countMap.put(s.charAt(j), 1);
				}

				if (countMap.get(s.charAt(j)) > k) {
					break;
				} else if (countMap.get(s.charAt(j)) == k) {
					Iterator it = countMap.entrySet().iterator();
					Boolean check = Boolean.TRUE;
					while (it.hasNext()) {
						Entry<Character, Integer> entry = (Entry<Character, Integer>) it.next();
						if (entry.getValue() != k) {
							check = Boolean.FALSE;
						}
					}
					if (check) {
						// System.out.println(i +"=="+j+"===="+"==="+countMap.toString());
						count++;
					}
				}
			}

		}

		return count;
	}

	public static void divide(int dividend, int divisor) {
		Double a1 = new Double(dividend);
		Double a2 = new Double(divisor);
		Double a3 = (Double) a1 / a2;
		System.out.println(a3);
		String answer = String.valueOf(a3);
		String afterDeci = answer.substring(answer.indexOf(".") + 1, answer.length());
		System.out.println(afterDeci);
		// char[] ch = afterDeci.toCharArray();
		String same = null;
		for (int i = 0; i < afterDeci.length(); i++) {
			if (same == null) {
				same = "" + afterDeci.charAt(i);
			} else if (same.length() == 1 && same.equalsIgnoreCase(String.valueOf(afterDeci.charAt(i)))) {
				continue;
			} else if (same.length() > 1) {
				same = same + afterDeci.charAt(i);
			}
		}

	}

}
