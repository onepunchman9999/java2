public void print(int[][] numbers) {
	int rows = numbers.length;
	int columns = numbers[0].length;
	
	int start = 0;
	while(columns > start*2 && rows > start *2) {
		printRing(numbers, start);
		start++;
	}
	
}

public void printRing(int[][] numbers, int start) {
	int rows = numbers.length;
	int columns = numbers[0].length;
	int endX = columns-start - 1;
	int endY = rows-start -1;
	
	//left to right
	for(int i=start; i <=endX; i++) {
		int number = numbers[start][i];
		Systrem.out.print(number);
	}
	
	//top to down on the right. make sure to add checks
	if (start < endY) {
		for(int i=start+1; i<=endY; i++) {
			int number = numbers[i][endX];
			System.out.print(number);
		}
	}
	
	//right to left on the bottom
	if (start < endX && start < endY) {
		for(int i=endX-1; i >=start; i--) {
			int number = [endY][i];
			System.out.print(number);
		}
	}
	
	//bottom to top on the left
	if (start < endX && start < endY-1) {
		for(int i=endY-1; i >=start-1; i--) {
			int number = numbers[i][start];
			System.out.print(number);
		}
	}
	
}