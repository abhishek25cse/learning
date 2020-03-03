package com.mantra.designpattern.structuralDP.decorator;

public class BeverageOne implements IBeverage {

	@Override
	public int addCost() {		
		return 2;
	}

	@Override
	public String appendDesc() {		
		return "B-One ";
	}

}
