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
	
	public void returnRef(String data) {
		int count = 0;
		if (head == null) {
			System.out.println("Empty Linked List");
			return;
//		}else {
//			count = 1;
//			if (head.data == data) {
//				System.out.println("The location of " +data + " is " + count);
//				return;
//			}
		}
		Node current = head;
		while (current.next != null) {
			count++;
			if (current.data == data) {
				System.out.println("The location of " +data + " is " + count);
				return;
			}
			current = current.next;
		}
		System.out.println("This item does not exist.");
	}

	public Boolean checkItemExists(String data, LinkedList A) {
		Node current = A.head;
		Boolean check = false;
		if (A.head == null) {
			System.out.println("This list is empty.");
			return false;
		}
		while (current.next != null) {
			current = current.next;
			if (current.data == data || A.head.data == data) {
				check = true;
			}
		}
		if (check == true) {
			System.out.println("The value: " + data + " exists in the list");
			return check;
		}else {
			System.out.println("The value: " + data + " does not exist in the list");
			return check;
		}
		
	}
	
	public void listUnion (LinkedList list1, LinkedList list2) {
		// gather all distinct elements of a list
		// Since it is a set all items already only occur once in each list
		Node current1 = list1.head;
		Node current2 = list2.head;
		while (current1 != null) {
			insertItem(current1.data);
			current1 = current1.next;
		}
		
		while (current2 != null) {
			Boolean check = checkItemExists(current2.data, list1);
			if(check == false) {
				insertItem(current2.data);
			}
			current2 = current2.next;
			
		}
	}
	
	public void listIntersection (LinkedList list1, LinkedList list2) {
		Node current2 = list2.head;
		
		
		while (current2 != null) {
			Boolean check = checkItemExists(current2.data, list1);
			if(check == true) {
				insertItem(current2.data);
			}
			current2 = current2.next;
			
		}
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
		LinkedList B = new LinkedList();
		LinkedList C = new LinkedList();
		LinkedList D = new LinkedList();
		A.insertItem("hi");
		A.insertItem("hello");
		A.insertItem("there");
		A.insertItem("eat");
		A.insertItem("banana");
		A.insertItem("bye");
		A.insertItem("Nanar");
		A.checkItemExists("hi", A);
		B.insertItem("hi");
		B.insertItem("cat");
		B.insertItem("there");
		B.insertItem("eat");
		B.insertItem("banana");
		B.insertItem("bye");
		B.insertItem("Nanar");
		B.insertItem("Seema");
		C.listUnion(A, B);
		D.listIntersection(A,B);
		System.out.println(" ");
		A.display();
		System.out.println(" ");
		B.display();
		System.out.println(" ");
		C.display();
		System.out.println("D: ");
		D.display();

	}

}
