public int coinChange(int [] coins, int total) {
	if (total == 0)
		return 0;

	int min = total;

	for(int i=0; i < coins.length; i++) {
			int amount = total - coins[i];
			if (amount >= 0) {
				int count = coinChange(coins, amount) + 1;
				min = Math.min(min, count);
			}
	}

	return min;

}


//cache
for (int i=0; i < total; i++) {
	cache[i] = -1;
}
public int coinChange(int[] coins, int total, int [] cache) {
	if (total == 0)
		return 0;

	int min = total;
	
	for(int i=0; i < coins.length; i ++) {
		int amount = total - coins[i];
		int count;
		if (cache[amount] != -1) {
			count = cache[amount];					
		} else {
			count = coinChange(coins, amount, cache) + 1;
			cache[amount] = count;
		}
		min = Math.min(count, min);
	}
	
	return min;
}
