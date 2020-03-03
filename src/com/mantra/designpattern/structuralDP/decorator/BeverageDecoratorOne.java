package com.mantra.designpattern.structuralDP.decorator;

public class BeverageDecoratorOne implements IBeverageDecorator {
	
	IBeverage wrapee;
	

	public BeverageDecoratorOne(IBeverage wrapee) {
		super();
		this.wrapee = wrapee;
	}

	@Override
	public int addCost() {		
		return wrapee.addCost()+3;
	}

	@Override
	public String appendDesc() {
		// TODO Auto-generated method stub
		return wrapee.appendDesc()+ "BDeco-One ";
	}

	@Override
	public String paintName() {		
		return "Happy Bday - Abhishek";
	}

}
