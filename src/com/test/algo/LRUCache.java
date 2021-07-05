package com.test.algo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {
	
	// this set maintains the element of cache
	private Set<Integer> hashSet = null;
	// this maintains the sequence of access
	private LinkedList<Integer> linkedList = null;
	private Integer CAPACITY = 0;
	public LRUCache(Integer CAPACITY) {
		super();
		hashSet = new HashSet<Integer>();
		linkedList = new LinkedList<Integer>();
		this.CAPACITY = CAPACITY;
	}
	
	public Boolean searchCache(Integer page) {
		Boolean isFound = Boolean.TRUE;
		if(!hashSet.contains(page)) {
			if(linkedList.size() == CAPACITY) {
				Integer last = linkedList.removeFirst();
				hashSet.remove(last);
			}		
			isFound =  Boolean.FALSE;
		} else {
			linkedList.remove(page);
		}
		linkedList.addLast(page);
		hashSet.add(page);
		
		System.out.println("       "+page +" is found = "+isFound + "     ");
		display();
		return isFound;
	}
	
	public void display() {
		Iterator itr = linkedList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() +" ");
		}
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
		
		cache.searchCache(1);
        cache.searchCache(2);
        cache.searchCache(3);
        cache.searchCache(1);
        cache.searchCache(4);
        cache.searchCache(5);
        cache.searchCache(2);
        cache.searchCache(2);
        cache.searchCache(1);
        System.out.println("FINAL ");
        cache.display();
		
	}
	

}
