package com.mantra.designpattern.structuralDP.decorator;

public class BeverageDecoratorTwo implements IBeverageDecorator {
	
	IBeverage wrapee;
	

	public BeverageDecoratorTwo(IBeverage wrapee) {
		super();
		this.wrapee = wrapee;
	}

	@Override
	public int addCost() {		
		return wrapee.addCost()+6;
	}

	@Override
	public String appendDesc() {
		// TODO Auto-generated method stub
		return wrapee.appendDesc()+ "BDeco-Two ";
	}

	@Override
	public String paintName() {
		// TODO Auto-generated method stub
		return "Best Of luck- Abhishek";
	}

}
