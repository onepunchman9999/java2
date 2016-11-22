public int find(int n) {
	return helper(1, n);
}

public int helper(int i, int j) {
	int m = i + (j - i) /2 ;
	if (i >= j) {
		return i;
	}
	
	if (isBadVersion(i)) {
		return helper(i, m);
	} else {
		return helper(m+1, j);
	}
	
}

public int helper2(int j) {
	int i = 1;
	
	while (i < j) {
		int m = i + (j -i)/2;
		if (isBadVersion(m)) {
			j = m;
		} else {
			i = m + 1;
		}
	}

	if (isBadVersion(i)) {
		return i;
	}
	
	return j;
}