package com.test;

public class LinkListDemoMain {

	public static void main(String[] args) {
		LinkListDemo list1 = new LinkListDemo();
		// 9123 --> 3219 --> 4219
		// 9999 --> 9999  --> 00001 --> 10000
		list1.add(0);
		list1.add(0);
		list1.add(0);
		list1.add(9);
		System.out.println("********  Input   Original List   ************ "+list1+"\n");
		System.out.println();
		LinkListDemo rever = list1.reverse();
	//	System.out.println("********     reverse          ***************** "+ rever);
		
		LinkListDemoMain mainC = new LinkListDemoMain();
		mainC.incrementByN(1,rever);
	//	System.out.println("*********reverse list increment by 1   ********* "+rever+"\n");
		System.out.println("****** Output Final incremented array by 1 ***** "+rever.reverse()
		);
		
		
		

	}
	
	public static void incrementByN(int i, LinkListDemo myList) {
		Integer carryOver = i;
		LinkListDemo node = myList;
		
		while(node.hasNext()) {
			//System.out.println("Node  "+node.getData());
			if(node.getData() >= 9) {
				node.setData(0);
				carryOver = i;
			} else {
				node.setData(node.getData()+carryOver);
				carryOver = 0;
			}
			node = node.getNext();
		}
		if(node.getData()+carryOver > 9) {
			node.setData(0);
			LinkListDemo nodeAdd = new LinkListDemo();
			nodeAdd.setData(1);
			nodeAdd.setNext(null);
			node.setNext(nodeAdd);
		} else {
			node.setData(node.getData()+carryOver);
		}
		
	}

}
