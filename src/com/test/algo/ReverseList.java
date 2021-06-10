package com.test.algo;

public class ReverseList {

	public static void main(String[] args) {		
		MyLinkList<String>  myList = new MyLinkList<String>();
		Node<String> node1 = new Node<String>();
		myList.setHead(node1);
		node1.setData("One");
		
		
		Node<String> node2 = new Node<String>();
		node1.setNext(node2);
		node2.setData("Two");
		
		Node<String> node3 = new Node<String>();
		node2.setNext(node3);
		node3.setData("Three");
		
		Node<String> node4 = new Node<String>();
		node3.setNext(node4);
		node4.setData("Four");
		
		System.out.println("Before "+myList);		
		myList.setHead(ReverseList.reverseList(myList.getHead()));
		//myList.setHead(ReverseList.reverse(myList.getHead()));
		System.out.println("After "+myList);

	}

	private static Node<String> reverseList(Node<String> node) {
		if(node.getNext() == null) {
			return node;
		}
		Node<String> reversedNode  = reverseList(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);
		System.out.println(" 1 "+reversedNode);				
		System.out.println(" 2 "+reversedNode);		
		System.out.println(" 3 "+node);
		return reversedNode;
	}
	

}

