package dsa.linkedlist;

public class LinkedList2 {
	Node head;

	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;

	}

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);

		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int data) { // same as addAtEnd
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;

	}

	public void traverse() {

		if (head == null) {
			System.out.println("List empty");
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public void insertAtPosition(int position, int data) {

		Node temp = head;
		Node newNode = new Node(data);
		if (position == 0) {
			// Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			return;
		}

		for (int i = 0; i < position - 1; i++) {
			if (temp == null || temp.next == null) {
				System.out.println("invalid position");
				return;
			}

			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;

	}

	public void deleteFromEnd() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		} else if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}

		temp.next = null;

	}

	public void deleteAtPosition(int position) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else if (position == 0) {
			head = null;
			return;
		}
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {

			if (temp == null || temp.next == null) {
				System.out.println("Invalid position empty");
			}
			temp = temp.next;
		}

		temp.next = temp.next.next;
	}
	
	public void reverseLinkedList() {
	    
    	Node prev = null;
    	Node current = head;
    	Node next = null;
    	
    	while(current !=null) {
    		next = current.next;
    		current.next = prev;
    		prev = current;
    		current = next;
    		
    	}
    	
    	head = prev;
		System.out.println(head.data);
    	
    }
}
