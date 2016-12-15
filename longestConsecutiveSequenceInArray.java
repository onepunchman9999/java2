//given unsorted array of integers, find the length of longest consecutive elements sequence

public int longest(int[] num) {
	if (num.length == 0) return 0;
	
	Set<Integer> set = new Set<Integer>();
	int max = 1;
	
	for(int i: num) {
		set.add(i);
	}
	
	for(int e: num) {
		int left = e -1;
		int right  = e+1;
		int count = 1;
		
		while(set.contains(left)) {
			count++;
			left--;
		}
		
		while(set.contains(right)){
			count++;
			right++;
		}
		
		max = Math.max(count, max);
	}
	
	return max;	
}