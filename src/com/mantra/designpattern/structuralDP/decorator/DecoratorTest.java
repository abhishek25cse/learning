package com.mantra.designpattern.structuralDP.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		IBeverage base = new BeverageOne();
		IBeverage top1 = new BeverageDecoratorOne(base);
		IBeverage top2 = new BeverageDecoratorTwo(top1);
		
		System.out.println(" Beverage = " +top2.appendDesc());
		System.out.println("cost = "+top2.addCost());
		

	}

}
