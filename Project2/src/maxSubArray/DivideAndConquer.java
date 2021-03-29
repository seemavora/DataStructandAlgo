package maxSubArray;

class DivideAndConquer {
	//using divide and conquer to find the max subarray
	static int[] result = new int[3];
	static int lstartDay = 0; //left index
	static int lendDay = 0; //left end index
	static int rstartDay = 0;//right start index
	static int rendDay = 0; //right end index
	static int start;//final start
	static int end;//final end
	public static int maxIntersectionSum(int nums[], int l, int m, int r) {
		int sum = 0;
		int lSum = Integer.MIN_VALUE; // setting left sum to lowest integer val possible
		for (int i = m; i >= l; i--) { // left subarray greatest sum
			sum = sum + nums[i];
			if (sum > lSum) {
				lSum = sum;
				lstartDay = m;
				lendDay= i;
			}
		}
		sum = 0;
		int rSum = Integer.MIN_VALUE;// setting right sum to lowest integer val possible
		for (int j = m + 1; j <= r; j++) { //right subarray greatest sum
			sum = sum + nums[j];
			if (sum > rSum) {
				rSum = sum;
				rendDay = j;
				rstartDay = m+1;
				
			}
		}
		
		int max = Math.max(lSum + rSum, Math.max(lSum, rSum));
		if (max == lSum + rSum) { //updating indexes accordingly
			start = lstartDay;
			end = rendDay;
		}else if(max == lSum) {
			start = lstartDay;
			start= lendDay;
		}else {
			start = rendDay;
			end = rstartDay;
		}

		result[0] = max;
		result[1]= start;
		result[2] = end;

		return max;
	}

	static int maxSubSum(int arr[], int l, int r) {
		if (l == r)
			return arr[l];

		int m = (l + r) / 2;
		return Math.max(Math.max(maxSubSum(arr, l, m), maxSubSum(arr, m + 1, r)), maxIntersectionSum(arr, l, m, r));
// recursive function to find the max
	}

}