//place eight queens

//place(board, 8, 0);

public void place(int [] board, int length, int index) {
	
	if (index == length) {
		if (checkBoard(board)) {
			System.out.println(board, length);
		}
	}
	
	for(int i = index; i < length; i ++) {
		int temp = board[i];
		board[i] = board[index];
		board[index] = temp;
		
		place(board, length, index+1);
		
		temp = board[i];
		board[i] = board[index];
		board[index] = temp;
		
	}
	
}

//same diagonal? since array is initialized with eight different numbers, any two queen are in different columns And thus
// it is only necessary to check diagonal
public boolean checkBoard(int[] board, int length) {
	for(int i=0; i< length; i++) {
		for (j = i+1; j < length; j++) {
			if (i-j == board[i] - board[j] || j-i == board[j] - board[i]) {
				return false;
			}
		}
	}
	
	return true;
}