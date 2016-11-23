//sort colors - red, white and blue flags
//arr contains a seris of 0, 1, 2 to represent the above flags

public sortColors(int[] arr) {
	int[] counts = new int[3];
	
	for (int i=0; i < arr.length; i++) {
		counts[arr[i]]++;
	}
	//[2, 5, 8]  ->  [2, 7, 15]
	for (int i=1 i < counts.length; i++) {
		counts[i-1] = counts[i-1] + counts[i];
	}
	
	int[] sorted = new int[arr.length];
	
	for(int i=0; i < arr.length; i++) {
		//start from 1
		int index = counts[arr[i]] - 1;
		//decrement 
		counts[arr[i]] = counts[arr[i]] - 1;
		sorted[index] = arr[i];
	}
	
	//src, src position, dest, dest position, length
	System.arraycopy(sorted, 0, arr, 0, arr.length);
	
}