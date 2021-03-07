package cs146S21.vora.project1;


public class LinkedList {

	Node head;
	public void insertItem(String data) {
		Node current = head; 
		Boolean check  = false;
		if (head == null) {
			head = new Node(data);
			return;
		}
		while(current.next != null) {
			current = current.next;
			if (current.data == data || head.data == data) {
				check = true;
			}
		}
		if (check == false) {
			current.next = new Node(data);
		}
	}
	
	 public void display() {    
	        //Node current will point to head    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }   
	public static void main(String[] args) {
		LinkedList A = new LinkedList();
		A.insertItem("hi");
		A.insertItem("hello");
		A.insertItem("bye");
		A.insertItem("hi");
		A.display();

	}

}
