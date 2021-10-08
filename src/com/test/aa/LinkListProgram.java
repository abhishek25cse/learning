package com.test.aa;

public class LinkListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//2,3,5,6,7,5,8,9
	//k=2
	//2,8,5,6,7,5,3,9
	//ouput

	/*
	 * k =2 n = 2, 3 counter = 0 size = 8 swap1 swap2 temp
	 */
	public static ListNode swapNodes(ListNode head, int k) {	
		ListNode n = head;
		int counter = 0;
		ListNode swap1 = null;
		ListNode swap2 = null;
		int size = findSize(head);
		//
		while(null != n.next) {
			n = n.next;			
			if(counter == (k-1)) {
				swap1 = n;
			}else if(counter == (size-(k-1))) {
				swap2 = n;
			}	
			counter++;
		}
		int temp = swap1.val;
		swap1.val = swap2.val;
		swap2.val = temp;
		
		/*
		 * swap1= 2 swap2= 5 temp = 3 3--> 9 ListNode temp = swap1.next; temp.next =
		 * swap2.next.next; swap1.next=swap2.next; swap2.next = temp;
		 * 
		 * swap1.next.next =
		 */
		
		return head;
		
		
		
	}
	
	public static  int findSize(ListNode head) {
		ListNode n = head;
		if(null == head) {
			return 0;
		}
		if(null == head.next) {
			return 1;
		}
		int size =1;
		
		while(null != n.next) {
			n=n.next;
			size++;		
		}
		return size;
	}


}
