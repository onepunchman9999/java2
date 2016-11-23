public void mergeSort(int []arr) {
	int[] temp = new int[arr.length];
	mergeSortHelper(arr, 0, arr.right, temp);
}

public void mergeSortHelper(int[] arr, int[] temp, int left, int right) {
	if (left < right) {
		int m = left + (right - left) / 2;
		mergeSortHelper(arr, temp, left, m);
		mergeSortHelper(arr, temp, m+1, right);
		merge(arr, temp, left, m+1, right);
	}
}

public void merge(int[] arr, int[] temp, int left, int right, int rightEnd) {
	int leftEnd = right -1;
	int k = left;
	
	while(left <= leftEnd || right <= rightEnd) {
		if (arr[left] < arr[right]) {
			temp[k++] = arr[left++];
		} else {
			temp[k++] = arr[right++];
		}
	}

    while(left <= leftEnd)    // Copy rest of first half
        temp[k++] = arr[left++];

    while(right <= rightEnd)  // Copy rest of right half
        temp[k++] = arr[right++];
	
	for(int i=0; i < arr.length; i++, rightEnd--) {
		arr[rightEnd] = temp[rightEnd];
	}	
}