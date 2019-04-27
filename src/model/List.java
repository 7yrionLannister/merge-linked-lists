package model;

public class List {
	private Node first;

	public List(Node first) {
		this.first = first;
	}
	
	public void mergeLists(List al) {
		if(first == null) {
			first = al.first;
		} else {
			Node auxiliar = new Node(first.getNumber()-1);
			auxiliar.setNext(first);
			first = auxiliar;

			Node menorAct = first;
			Node mayorAct = first.getNext();
			Node mayorAdd = al.first;

			while(al.first != null) {
				while(mayorAct != null && mayorAdd.compareTo(mayorAct) > 0) {
					menorAct = menorAct.getNext();
					mayorAct = mayorAct.getNext();
				}
				if(mayorAct == null) {
					menorAct.setNext(al.first);
					al.first = null;
				} else {
					while(mayorAdd.getNext() != null && mayorAdd.getNext().compareTo(mayorAct) <= 0) {
						mayorAdd = mayorAdd.getNext();
					}
					Node temp = mayorAdd.getNext();
					
					mayorAdd.setNext(mayorAct);
					menorAct.setNext(al.first);

					al.first = temp;
					mayorAdd = al.first;
					
					menorAct = mayorAct;
					mayorAct = mayorAct.getNext();
				}
			}
			first = first.getNext();   //delete auxiliar
		}
	}
	
	@Override
	public String toString() {
		String ret = "[";
		Node current = first;
		while(current != null) {
			ret += "("+current.getNumber()+")";
			current = current.getNext();
			if(current != null) {
				ret += ",";
			}
		}
		ret += "];";
		
		return ret;
	}
}
