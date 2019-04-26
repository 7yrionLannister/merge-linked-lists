package model;

public class Node implements Comparable {
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

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
