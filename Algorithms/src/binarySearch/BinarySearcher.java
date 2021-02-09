package binarySearch;

/**
   A class for executing binary searches in an array.
*/
public class BinarySearcher
{  
   /**
      Finds a value in a range of a sorted array, using the binary
      search algorithm.
      @param a the array in which to search
      @param low the low index of the range
      @param high the high index of the range
      @param value the value to find
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public static int search(int[] a, int low, int high, int value)
   {  
	   int midIndex = (high + low)/2;
	   //Simple case, uses the value at midIndex
	   if ( a[midIndex] == value) {
		   return midIndex;
	   }
	   
	   // CHeck if value of current index is greater than searched for
	   if(a[midIndex] > value) {
		   return search(a, low, midIndex,value);
	   }
	   else if (a[midIndex] < value){
		   return search(a,midIndex, high, value);
	   }
	   else {
		   return -1;
	   }
   }
   
   
}


