public void printMatrixClockwise(int[][] arr) {
	int rows = arr.length;
	int columns = arr[0].length;
	
	int start = 0;

	while (start *2 < columns && start *2 < rows)
		print(arr, start);
		start++;
	}
}

public void print(int[][] arr, int start) {
	int rows = arr.length;
	int columns = arr[0].length;
	
	//endX & endY varies because start changes and shrinks by 1
	int endX = columns - start - 1;
	int endY = rows - start - 1;
	
	for(int i = start; i < endX; i++) {
		System.out.print(arr[start][i]);
	}

	//be sure to add 1 to i so that they do not overwrap
	if (start < endY) {
		for(int i = start+1; i < endY; i++) {
			Sstem.out.print(arr[i][endX])
		}
	}


	if (start < endX && start < endY) {
		for(int i = endX-1; i >= start; i--) {
			Sstem.out.print(arr[endY][i])
		}
	}

	if (start<endX && start < endY) {
		for(int i=endY-1; i >= start; i--) {
			System.out.print(arr[i][start]);		
		}
	}



}
