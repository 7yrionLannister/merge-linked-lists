package ui;

import model.List;
import model.Node;

public class Main {

	public static void main(String[] args) {
		Node n1 = new Node(2);
		Node n2 = new Node(5);
		Node n3 = new Node(6);
		Node n4 = new Node(7);
		Node n5 = new Node(10);
		Node n6 = new Node(15);
		Node n7 = new Node(16);
		Node n8 = new Node(18);
		Node n9 = new Node(19);
		Node n10 = new Node(21);
		Node n11 = new Node(22);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n9);
		n9.setNext(n10);
		n10.setNext(n11);
		
		List originalList = new List(n1);
		
		Node n1b = new Node(1);
		Node n2b = new Node(4);
		Node n3b = new Node(5);
		Node n4b = new Node(6);
		Node n5b = new Node(10);
		Node n6b = new Node(12);
		Node n7b = new Node(13);
		Node n8b = new Node(19);
		Node n9b = new Node(19);
		Node n10b = new Node(19);
		Node n11b = new Node(23);
		n1b.setNext(n2b);
		n2b.setNext(n3b);
		n3b.setNext(n4b);
		n4b.setNext(n5b);
		n5b.setNext(n6b);
		n6b.setNext(n7b);
		n7b.setNext(n8b);
		n8b.setNext(n9b);
		n9b.setNext(n10b);
		n10b.setNext(n11b);
		
		List paramList = new List(n1b);
		
		System.out.println("Original list before merge\n	" + originalList);
		System.out.println("Param list before merge\n	" + paramList);
		
		System.out.println("Merging...");
		originalList.mergeLists(paramList);
		
		System.out.println("Original list after merge\n	" + originalList);
		System.out.println("Param list after merge\n	" + paramList);
	}

}
