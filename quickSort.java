public void quickSort(int[] arr, int left, int right) {
	int index = parition(arr, left, right);
	
	if (left < index -1) {
		quickSort(arr, left, index-1);
	}
	
	if (index < right) {
		quickSort(arr, index, right);
	}
	
}

//left < index < right

public void partition(int[] arr, int left, int right) {
	
	int m = left + (right-left) / 2;
	int pivot = arr[m];
	int i = left;
	int j = right;
	while (i <= j) {
	    while(arr[i] < pivot) {
			i++;
		}
		
		while(arr[j] > pivot) {
			j--;
		}
		
		if (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	return i;
}