//find the sum of contiguous subarray of numbers which has the largest sum.
//1st element for left half and right half - base
//each element above from the recursive and crossSum with middle element from the previous returns
//compare max

public int maximalSubArraySum(int[] arr, int left, int right) {
	//base
	if (left == right) {
		return arr[left];
	}
	
	int middle = (left + right) / 2;
	
	//left
	int n1 = maximalSubArraySum(arr, left, middle);
	//right
	int n2 = maximalSubArraySum(arr, middle+1, right);
	//cross
	int n3 = maximalCrossSum(arr, left, middle, right);
	
	return Math.max(n1, Math.max(n2, n3));
}

public int maximalCrossSum(int[] arr, int left, int middle, int right) {
	int sum = 0;
	int leftSum = Math.MIN;
	//use middle and left 
	for(int i=middle; i >=left; i--) {
		sum = sum + arr[i];
		if (sum > leftSum) {
			leftSum = sum;
		}
	}
	
	sum = 0;
	int rightSum = Math.MIN;
	//use middle and right
	for(int i=middle+1; i <right; i++) {
		sum = sum + arr[i];
		if (sum > rightSum) {
			rightSum = sum;
		}	
	}
	
	return leftSum + rightSum;
}