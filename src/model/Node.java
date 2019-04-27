package model;

public class Node implements Comparable<Node> {
	private int number;
	private Node next;
	
	
	public Node(int n) {
		number = n;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}

	public int getNumber() {
		return number;
	}	
	
	@Override
	public int compareTo(Node an) {
		return number - an.number;
	}
}
