package com.check;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.test.oracle.MapValue;

public class HashMapImpl implements Serializable{
	HashMap h = new HashMap();
	
	List<LinkedList<MapValue>> eleAll ;
	
	public MapValue get(MapKey key) {
		MapValue value = null;
		int hash = key.hashCode();
		LinkedList<MapValue> ll = eleAll.get(hash);
		/*
		 * for( MapEntrySet ent : ll) { if(ent.getKey().equals(key)) { value=
		 * ent.getValue(); } }
		 */
		return value;
	}
	
	public void put(MapKey key, MapValue value ) {
		// check if already present 
		// if already present then replace
		// else add to the map by checking the hashCode of the Bucket.
		int hashCode = key.hashCode();
		if( null == this.get(key)) {
			MapEntrySet ele = new MapEntrySet(key, value);			
			eleAll.get(hashCode).add(value);			
		} else {
			LinkedList<MapValue> ll = new LinkedList<MapValue>();
			ll.add(value);
			eleAll.add(hashCode, ll);
		}
		
	}
	
	
	

}
