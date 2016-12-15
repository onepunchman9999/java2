//2d matrix and rotate the matrix by 90 (clockwise)
//matrix[i][j] = matrix[n-1-j][i]
//j changes and i stays - i representing row and j representing column
//make sure row/col are roatated n/2 times and where temp is stored.


public void rotate(int[][] matrix) {
	int n = matrix.length;
	for (int i=0; i < n/2; i++) {
		for(int j=0; j < Math.ceil(n/2); j++) {
			int [][] temp = matrix[i][j];
			matrix[i][j] = matrix[n-1-j][i];
			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
			matrix[j][n-1-i] = temp;
			
		}
	}	
	
	
}