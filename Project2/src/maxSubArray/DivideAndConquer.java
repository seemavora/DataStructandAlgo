package maxSubArray;

class DivideAndConquer {
	
	static int[] result = new int[3];
	static int lstartDay = 0;
	static int lendDay = 0;
	static int rstartDay = 0;
	static int rendDay = 0;
	static int start;
	static int end;
	public static int maxIntersectionSum(int nums[], int l, int m, int r) {
		int sum = 0;
		int lSum = Integer.MIN_VALUE;
		for (int i = m; i >= l; i--) {
			sum = sum + nums[i];
			if (sum > lSum) {
				lSum = sum;
				lstartDay = m;
				lendDay= i;
			}
		}
		sum = 0;
		int rSum = Integer.MIN_VALUE;
		for (int j = m + 1; j <= r; j++) {
			sum = sum + nums[j];
			if (sum > rSum) {
				rSum = sum;
				rendDay = j;
				rstartDay = m+1;
				
			}
		}
		
		int max = Math.max(lSum + rSum, Math.max(lSum, rSum));
		if (max == lSum + rSum) {
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

		int temp = Math.max(Math.max(maxSubSum(arr, l, m), maxSubSum(arr, m + 1, r)), maxIntersectionSum(arr, l, m, r));

		return Math.max(Math.max(maxSubSum(arr, l, m), maxSubSum(arr, m + 1, r)), maxIntersectionSum(arr, l, m, r));

	}

}