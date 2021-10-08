package com.check;

import java.util.LinkedList;

public class MapValue {
	
	Integer values;

	public Integer getValues() {
		return values;
	}

	public void setValues(Integer values) {
		this.values = values;
	}
	
	public Boolean equals(MapValue o1) {
		if (o1 != this) {
			return Boolean.FALSE;
		}
		if (null != o1) {
			if (o1.getValues() == this.getValues()) {
				return Boolean.TRUE;
			}
		} else {
			return Boolean.FALSE;
		}
		return Boolean.FALSE;
	}

	public int hashCode() {
		if (null == this) {
			return 0;
		}
		return this.hashCode();
	}
	
	
	

}
