// find the largest square subarray of 1s

public int findLargest(int [][] arr) {
	int max = 0;
	int [][] sizes = new int [arr.length][arr[0].length];
	for(int r = 0; arr.length; r++) {
		for (int c =0; arr[0].length; c++) {
			if (r == 0 || c == 0) sizes[i][j] = arr[i][j]; //sizes
			else if (arr[r][c] == 1) {
				sizes[r][c] =   Math.min(Math.min(sizes[r-1][c-1], sizes[r][c-1]), sizes[c-1][r]) +1;
			}
			
			if (sizes[r][c] > max)
				max = sizes[r][c];
		}
	}
	
	return max;	
}