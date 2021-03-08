package cs146S21.vora.project1;

public class LinkedList {

	Node head;

	public void insertItem(String data) {
		Node current = head;
		Boolean check = false;
		if (head == null) {
			// in the case the linked list is empty, adds element as head
			head = new Node(data);
			return;
		}
		while (current.next != null) {
			// checking to make sure data does not already exist in the list
			current = current.next;
			if (current.data == data || head.data == data) {
				check = true;
			}
		}
		if (check == false) {
			// if the data does not exist in the linked list, data is added
			current.next = new Node(data);
		}
	}

	public void deleteValue(String data) {
		if (head == null) {
			// takes care of edge case if empty linked list
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
				// if data value is located, it is removed
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public int countNumValue(LinkedList A) {
		int count = 0;
		if (head == null) {
//			System.out.println("Empty Linked List");
			return 0;
		} else {
			count = 1;
		}
		Node current = head;
		while (current.next != null) {
			// count keeps track of each iteration until next data point is null
			count++;
			current = current.next;
		}
//		System.out.println("The linked list has a length of: " + count);
		return count;
	}

	public int returnRef(String data) {
		int count = 0;
		if (head == null) {
			//check for empty linked list
			System.out.println("Empty Linked List");
			return 0;
		}
		Node current = head;
		while (current.next != null) {
			count++;
			if (current.data == data) {
				// keeps track of index, until data is located
				System.out.println("The location of " + data + " is " + count);
				return count;
			}
			current = current.next;
		}
		System.out.println("This item does not exist.");
		return -1;
	}

	public Boolean checkItemExists(String data, LinkedList A) {
		Node current = A.head;
		Boolean check = false;
		if (A.head == null) {
			//checks for empty linked list
			System.out.println("This list is empty.");
			return false;
		}
		while (current.next != null) {
			current = current.next;
			// checks each node for a certain data value
			if (current.data == data || A.head.data == data) {
				check = true;
			}
		}
		if (check == true) {
			System.out.println("The value: " + data + " exists in the list");
			return check;
		} else {
			System.out.println("The value: " + data + " does not exist in the list");
			return check;
		}

	}

	public void listUnion(LinkedList list1, LinkedList list2) {
		// gather all distinct elements of a list
		// Since it is a set all items already only occur once in each list
		Node current1 = list1.head;
		Node current2 = list2.head;
		while (current1 != null) {
			//new list will already have all elements of list 1
			insertItem(current1.data);
			current1 = current1.next;
		}

		while (current2 != null) {
			Boolean check = checkItemExists(current2.data, list1);
			if (check == false) {
				// checks for the unique values of list 2 to add to new union list
				insertItem(current2.data);
			}
			current2 = current2.next;

		}
	}

	public void listIntersection(LinkedList list1, LinkedList list2) {
		Node current2 = list2.head;

		while (current2 != null) {
			Boolean check = checkItemExists(current2.data, list1);
			if (check == true) {
				insertItem(current2.data);
			}
			current2 = current2.next;

		}
	}

//	public static void main(String[] args) {
//		LinkedList A = new LinkedList();
//		A.insertItem("A");
//		A.insertItem("B");
//		A.countNumValue(A);
//
//	}

}
