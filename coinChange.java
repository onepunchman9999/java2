public int change(int x, int [] coins) {
	if (x == 0) return 0;
	
	int min = x; // 1s
	for (int c : coins) {
		if (x - c >= 0) {
			int counts = change(x - c, coins);
			if (min > counts + 1) min = counts + 1;
		}
	}
	
	return min;
	
}

public int change(int x, int[] coins) {
	int [] cache = new int[x];
	for(int i=1; i < x; i++) {
		cache[i] = -1;
	} 
	return change(cache, x, coins);
}

public int change(int [] cache, int x, int [] coins) {
   if (x == 0) return 0;
   
   int min = x;
   int counts;
   for (int c: coins) {
	   if (x - c >= 0) {
		    if (cache[x-c] > -1) {
			   counts = cache[x-c];
		    } else {
			   counts = change(cache, x-c, coins);
			   cache[x-c] = counts + 1;
		    }
	   
		    if (min > counts + 1) min = counts + 1;
	   }
   }
	
   return counts;
	
}