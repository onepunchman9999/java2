//search for range
public int[] searchForRange(int[] input) {
	return helper(input, 0, intput.length);
}


//iterative
public int[] helper(int[]input, int left, int right, int target) {
	int[] result = new int[2];
	int l, r;
	while (left < right) {
		int m = int [left + (right-left) /2];
		
		if (input[m] == target) {
			l = left;
			r = right;
			while(input[m] == input[l-1]) {
				l--;
				result[0] = l;
			}
			while(input[m] == input[r]) {
				r++;
				result[1] = r;
			}
			
			return result;
		} else if (input[m] < target) {
			left = m + 1;
		} else {
			right = m - 1;
		}		
	}
	return null;
}


//resursive

public void helper(int[] input, int left, int right, int target, int[] result) {
	if (right > left) return;
	int m = left + (right - left) / 2;
    if (input[m] < target) {
		helper(input, m+1 right, target, result);
	} else if (input[m] > target) {
		helper(input, left, m -1, target, result);
	} else {
		result[0] = m;
		result[1] = m;
		int l, r;
		l = left;
		r = right;
		
		while(input[m] == input[l-1]) {
			l--;
			result[0] = l;
		}
		while(input[m] == input[r]) {
			r++;
			result[1] = r;
		}
		return;		
	}
	
}
