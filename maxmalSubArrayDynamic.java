//find contiguous sub array within an array, which has the largest sum
//ignore the sum of the previous n-1 elements, if nth element is greater than the sum including the current n from n-1th

public int maxSubArray(int[] arr) {
	int max = arr[0];
	int sums = new int[arr.length];
	
	for(int i=1; i <arr.length; i++) {
		sums[i] = Math.Max(arr[i], sums[i-1] + arr[i]);
		max = Math.max(sums[i], max);
	}
	
	return max;
	
}