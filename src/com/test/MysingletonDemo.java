package com.test;

public class MysingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class SingletonDemo {
	
	private SingletonDemo inst;
	
	public SingletonDemo getInst() {
		if (null == inst) {
			synchronized (this) {
				return inst = new SingletonDemo();
			}
		} else {
				return inst;
			}
		}
}
