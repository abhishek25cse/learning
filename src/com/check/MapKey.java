package com.check;

public class MapKey {

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Boolean equals(MapKey o1) {
		if (o1 != this) {
			return Boolean.FALSE;
		}
		if (null != o1) {
			if (o1.getKey().equalsIgnoreCase(this.getKey())) {
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
