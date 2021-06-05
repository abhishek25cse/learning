package com.test;

public class PublisherDemo {
	
	//List<Consumer>
	
	private String name;
	private String add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		ConsumerDemo cD = new ConsumerDemo();
		cD.nameUpdated(name);
		
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
	public static void main(String[] a) {
		PublisherDemo pD = new PublisherDemo();
		pD.setName("Abhishek");
		pD.setAdd("asdas");
	}
	
	

}
