package com.test;

public class LinkListDemo {

	Integer data;
	LinkListDemo head;
	LinkListDemo next;

	public LinkListDemo() {
		super();
		this.setData(null);
		this.setHead(null);
		this.setNext(null);

	}

	@Override
	public String toString() {
		return  data + " " + ((next!=null)?next:"") ;
	}

	public Boolean hasNext() {
		if (null != getNext()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	void add(int newItem) {
		if (this.getHead() == null) {
			this.setData(newItem);
			this.setHead(this);
			return;
		}
		LinkListDemo llD = new LinkListDemo();
		llD.setData(newItem);
		llD.setNext(null);
		LinkListDemo node = this;
		while (node.hasNext()) {
			node = node.getNext();
		}
		node.setNext(llD);
	}

	LinkListDemo reverse() {
		LinkListDemo prev = null;
		LinkListDemo curr = this;
		LinkListDemo fut = null;
		while(curr.hasNext()) {				
			fut = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = fut;		
		}
		curr.setHead(curr);
		curr.setNext(prev);
		return curr;
		
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public LinkListDemo getHead() {
		return head;
	}

	public void setHead(LinkListDemo head) {
		this.head = head;
	}

	public LinkListDemo getNext() {
		return next;
	}

	public void setNext(LinkListDemo next) {
		this.next = next;
	}

}
