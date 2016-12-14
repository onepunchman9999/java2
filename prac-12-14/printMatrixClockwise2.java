public void printMatrixClockwise(int[][] numbers) {
	int rows = numbers.length;
	int cols = numbers[0].length;

	int start = 0;
	while(start * 2 < rows && start * 2 < cols) {
		print(numbers, start);
		start++;
	}
}


public void print(int[][] numbers, int start) {
	int rows = numbers.length;
	int cols = numbers[0].length;
	
	int endX = cols - start -1;
	int endY = rows - start -1;

	for(int i = start; i < endX; i++)
		print(start, i);

	if (start < endY) {
		for (int i = start+1; i < endY; i++)
			print(i, endX);	
	}

	if (start < endX && start < endY) {
		for (int i = endX-1; i >=start; i--)
			print(endY, i);
	}

    if (start < endX && start < endY) {
		for (int i = endY-1; i >=start-1; i--)
			print(i, start);
	}

}
