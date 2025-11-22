package dsa.linkedlist;

public class LinkeListService {
	public static void main(String []args) {
		LinkedList2 linkedList2 = new LinkedList2();
		linkedList2.addAtEnd(1);
		
		linkedList2.addAtEnd(12);
		linkedList2.addAtEnd(13);
		linkedList2.addAtEnd(14);
		
		//linkedList2.traverse();
		//linkedList2.addAtEnd(14);
		//linkedList2.insertAtPosition(4, 70);
		linkedList2.reverseLinkedList();
	}

}
