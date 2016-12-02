//find the smallest one milion numbers in one billion numbers
//selection rank algo - o(n)

public int partition(int[] array, int left, int right, int pivot) {
	while(true) {
		
		while(left <= right && array[left] < pivot) left++;
		
		while(left <= right && array[right] > pivot) right--;
		
		// return the end of left partition
		if (left > right) return left - 1;
		
		swap(array, left, right);
	}
	
}

public int rank(int[] array, int left, int right, int rank) {
	int pivot = array[rand(left, right)];
	int leftEnd = partition(array, left, right, pivot);
	
	//get the size
	int leftSize = leftEnd - left + 1;
	
	if (leftSize == rank) {
		return leftEnd;
	} else if (rank < leftSize) {
		return rank(array, left, leftEnd, rank);
	} else {
		// look for an element in rank - leftSize on the right
		return rank(array, leftEnd+1, right, rank-leftSize);
	}
	
	
}