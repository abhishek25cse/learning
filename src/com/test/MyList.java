package com.test;

import java.util.ArrayList;

public class MyList<String> extends ArrayList<String> {
	// override methods to be blocked

public boolean add (String t) {
		return Boolean.FALSE;
}

/*
 * public String remove(int n) { return }
 */

}
