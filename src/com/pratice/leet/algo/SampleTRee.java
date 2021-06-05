package com.pratice.leet.algo;

import java.util.List;



public class SampleTRee {/*
							 * 
							 * public static void main(String[] a) { SampleTRee.sumTreeTransverse(); }
							 * 
							 * 
							 * public static int sumTree(Node n) { Integer sum = n.getValue(); List<Node>
							 * children = n.getChildren(); while(children.size() > 0) { for(Node nC :
							 * children) { sum = sum + sumTree(nC); } } return sum; } }
							 * 
							 * 
							 * public static int sumTreeTransverse(Node n) { Integer sum = n.getValue();
							 * List<Node> children = n.getChildren();
							 * 
							 * for (Node nE : children ) { while(nE.getChildren().size()> 0) {
							 * children.addAll(nE.getChildren()); sum = sum+nE.getValue(); }
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * 
							 * public static Node mergeSortedList(Node l1, Node l2) { // Implement Node
							 * finalLinkListHead = new Node(); Node currFinalPosi = new Node();
							 * 
							 * 
							 * // if(l2 == null) { return l1; } else if(l1 == null) { return l2; } if
							 * (l1.getValue() > l2.getValue()) { finalLinkListHead = l2; l2 = l2.getNext();
							 * currFinalPosi = l2; } else { finalLinkListHead = l1; l1 = l1.getNext();
							 * currFinalPosi = l1; } while (l2 != null && l1 != null) { if (l1.getValue() >
							 * l2.getValue()) { currFinalPosi.next() = l2; l2 = l2.getNext(); currFinalPosi
							 * = currFinalPosi.getNext(); } else { currFinalPosi.next() = l1; l1 =
							 * l1.getNext(); currFinalPosi = currFinalPosi.getNext(); }
							 * 
							 * } // copy the remaioning if(l1 != null) { // copy remaining while(l1 != null)
							 * { currFinalPosi.next() = l1; l1 = l1.getNext(); currFinalPosi =
							 * currFinalPosi.getNext(); }
							 * 
							 * 
							 * } else if(l2!= null ) { while(l2 != null) { currFinalPosi.next() = l2; l2 =
							 * l2.getNext(); currFinalPosi = currFinalPosi.getNext(); } } return
							 * finalLinkListHead; }
							 * 
							 * 
							 * 
							 * public interface Node { Integer getValue();
							 * 
							 * Node getNext(); }
							 * 
							 * }
							 */

}
