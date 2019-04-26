package model;

public class List {
	private Node first;
	
	public void mergeLists(List al) {
		if(first == null) {
			first = al.first;
		} else {
			Node menorAct;
			Node mayorAct = first;
			
			Node menorAdd = al.first;
			Node mayorAdd = al.first;
			
			while(mayorAdd.getNext() != null && mayorAdd.getNext().compareTo(mayorAct) <= 0) {
				mayorAdd = mayorAdd.getNext();
			}
			
			Node temp = mayorAdd.getNext();
			
			mayorAdd.setNext(mayorAct);
			first = menorAdd;
			
			al.first = temp;
			
			menorAct = mayorAct;
			mayorAct = menorAct.getNext();
			
			menorAdd = temp;
			mayorAdd = temp;
		}
	}
}
