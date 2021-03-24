package insertion;

import java.util.Arrays;

public class InsertionSortpt2 {
	
	public void sort(int[] array) {
		for(var i = 1; i < array.length; i++) {
			var current = array[i];
			var j= i-1;
			while(j>= 0 && array[j] > current ) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = current;
		}
	}

	 public static void main(String args[]) 
	    { 
	        InsertionSortpt2 ob = new InsertionSortpt2(); 
	        int[] numbers = { 3,45,32,1,23 }; 
	        ob.sort(numbers); 
	        System.out.println(Arrays.toString(numbers));
	    }

}
