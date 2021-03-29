package maxSubArray;

public class BruteForce {

	static int[] result = new int[3]; // keeps track of results: start and end date, and max
// Uses Brute Force to find the maximum subarray.
	public static int[] bruteForce(int[] Arr) {
		int len = Arr.length; //array length
		int max = Arr[0];//array max
		int startDay = 0; // tracks start index
		int endDay = 0; //tracks end index
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum = Arr[j] + sum;
				if (sum > max) { // if the sum surpasses the max, max is updated
					max = sum;
					startDay = i; // given max is changed, start day updated
					endDay = j; // end day is updated
				}
				result[0] = max;
				result[1] = startDay;
				result[2] = endDay;
			}

		}
		return result;
	}

}
