package com.check;

import com.test.oracle.MapValue;

public class MapEntrySet {
	
	MapKey key;
	
	MapValue value;

	public MapEntrySet(MapKey key, MapValue value) {
		super();
		this.key = key;
		this.value = value;
	}

	public MapKey getKey() {
		return key;
	}

	public void setKey(MapKey key) {
		this.key = key;
	}

	public MapValue getValue() {
		return value;
	}

	public void setValue(MapValue value) {
		this.value = value;
	}
	
	

}
