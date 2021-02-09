package linkylisty;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linky  = new LinkedList<Integer>();
		linky.add(6);
		linky.add(555);
		linky.add(11);
		
//		linky.remove(); 
		// removes first object of the list
//		linky.clear();
//		removes all items from the list;
		
//		System.out.println(linky);
//		System.out.println(linky.get(1)); 
//		gets the value at a certain index
		
		
//		In order to iterate through linked list to find a certain value
//		you need to create an iterator
		
		Iterator it = linky.iterator();
		while(it.hasNext()) {
			if((int)it.next() == 11) {
				System.out.println("we found 11");
			}
		}

	}

}
