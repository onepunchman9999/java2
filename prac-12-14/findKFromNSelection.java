public int findK(int[] arr, int start, int end, int rank) {
	int pivot = arr[rand(start, end)];
	
	int leftEnd = partition(arr, start, end pivot);
	//get leftSize - do not forget to subtract from the leftEnd with start
	int leftSize = leftEnd - start + 1;
	
	if (leftSize == rank) {
		return leftEnd;
	} else if (rank < leftSize) {
		findK(arr, start, leftSize, rank);
	} else {
		findK(arr, leftSize +1, end, rank - leftSize);	
	}
}

public int partition(int[] arr, int start, int end, int pivot) {
	while(true) {
		while(start < end && arr[start] < pivot) {
			start++;		
		}	

		while(start < end && arr[end] > pivot) {
			end--;
		}

		if (start > end) {
			return start - 1;		
		}
		
		swap(arr, start, end);
	}

}
