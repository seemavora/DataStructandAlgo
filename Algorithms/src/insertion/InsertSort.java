package insertion;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A [] = new int[10];
		populateArray(A);
		System.out.println("Before Sorting:");
		printArray(A);
		System.out.println(" ");
		
		int key; 
		int i; 
		for(int j = 1; j<A.length;j++) {
			key = A[j];
			i = j - 1;
			while ((i > -1) && (A[i] > key)) {
				A[i+1] = A[i];
				i = i-1;
			}
			A[i+1] = key;
		}
		
		System.out.println("After Sorting:");
		printArray(A);
		
	}
	
	public static void printArray(int [] B) {
		for (int i = 0; i <B.length; i++) {
			System.out.print(B[i] + " ");
		}
	}
	
	public static int[] populateArray(int [] B) {
		for (int i = 0; i <B.length; i++) {
			B[i] = (int)(Math.random() *100);
		}
		return B;
	}
	

}
