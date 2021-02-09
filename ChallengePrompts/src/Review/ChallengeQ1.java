package Review;

public class ChallengeQ1 {

	static int max;
	static int min;
	static int maxIndex;
	static int minIndex;
	 public static void swapLargestAndSmallest(int[] a)
	   {
		 max  = a[0];
		 min = a[0];
		 if(a.length <= 1) {
			 minIndex = 0;
			 maxIndex = 0;
		 }
		 for(int i = 0; i < a.length; i ++) {
			 if (a[i] < min) {
				 min = a[i];
				 minIndex = i;
			 }else if (a[i] >= max) {
				 max= a[i];
				 maxIndex = i;
			 }
		 }
		 a[minIndex] = max;
		 a[maxIndex] = min;
		 
	   }
	 
	 
	 
}
