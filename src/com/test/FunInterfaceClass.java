package com.test;

public class FunInterfaceClass {	
	public static void main(String[] a) {
		InterfaceLowercase f = n->   {
			return n.toLowerCase();
		};		
		System.out.println(f.toLowerCase("ABHISHEKasdsa"));
	}
}


