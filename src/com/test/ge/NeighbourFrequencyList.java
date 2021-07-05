package com.test.ge;

import java.io.Serializable;
import java.util.List;

public class NeighbourFrequencyList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int occurred;
	private List<String> words;
	public int getOccurred() {
		return occurred;
	}
	public void setOccurred(int occurred) {
		this.occurred = occurred;
	}
	public List<String> getWords() {
		return words;
	}
	public void setWords(List<String> words) {
		this.words = words;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + occurred;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NeighbourFrequencyList other = (NeighbourFrequencyList) obj;
		if (occurred != other.occurred)
			return false;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[times = " + occurred + ", words=" + words + "]";
	}
	
	
}
