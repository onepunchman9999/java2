//find largest square submatrix

public int findLargestSquareSubMatrix(int [][] arr) {
	int max = 0;
	int [][] sizes = new int[arr.length][arr[0].length];
	for(int i =0; i < arr.length; i++) {	
		for(int j =0; j < arr[0].length; j++) {
			if (i ==0 && j ==0) {
				sizes[i][j] = arr[i][j];
			} else {
				sizes[i][j] = Math.min(sizes[i-1][j-1]], Math.min(sizes[i-1][j], sizes[i][j-1]) + 1;
			}
			
			// keep track of max while in process
			if (sizes[i][j] > max) {
				max = sizes[i][j];
			}
		}
		

	}


}
