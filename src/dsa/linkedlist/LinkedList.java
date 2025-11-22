package dsa.linkedlist;

public class LinkedList {

    Node head;

    // TRAVERSAL
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //  ADD (Append at End)
    public void add(int data) {
        Node newNode = new Node(data);

        // Case 1: list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Case 2: go to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode; // attach at end
    }

    //INSERT AT BEGINNING
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // point to old head
        head = newNode;        // move head to new node
    }

    // INSERT AT END (Same as add) 
    public void insertAtEnd(int data) {
        add(data); // reuse add() — both do the same
    }

    // INSERT AT POSITION
    // Position is ZERO-BASED (0 = first position)
    public void insertAtPosition(int data, int position) {

        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;

        // Move temp to the node BEFORE the desired position
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // DELETE FROM BEGINNING 
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next; // move head forward
    }

    //  DELETE FROM END 
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Stop at second-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.next = temp.next;
        		temp.next = null; // delete last node
    }

    // DELETE AT POSITION 
    public void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }
    
    // Reverse
    public Node reverseLinkedList() { //0(n)
    
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
		return head;
    	
    }
}
