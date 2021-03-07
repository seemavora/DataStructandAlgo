package cs146S21.vora.project1;

public class LinkedList {

	Node head;

	public void insertItem(String data) {
		Node current = head;
		Boolean check = false;
		if (head == null) {
			head = new Node(data);
			return;
		}
		while (current.next != null) {
			current = current.next;
			if (current.data == data || head.data == data) {
				check = true;
			}
		}
		if (check == false) {
			current.next = new Node(data);
		}
	}

	public void deleteValue(String data) {
		if (head == null) {
			System.out.println("Cannot remove value: " + data + ".This linked list is empty.");
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void countNumValue(LinkedList A) {
		int count = 0;
		if (head == null) {
			System.out.println("Empty Linked List");
			return;
		}else {
			count = 1;
		}
		Node current = head;
		while (current.next != null) {
			count++;
			current = current.next;
		}
		System.out.println("The linked list has a length of: " + count);
	}

	public void display() {
		// Node current will point to head
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			// Prints each node by incrementing pointer
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList A = new LinkedList();
		A.countNumValue(A);
		A.insertItem("hi");
		A.insertItem("hello");
		A.insertItem("bye");
		A.insertItem("hi");
		A.deleteValue("Seema");
		A.display();

	}

}
