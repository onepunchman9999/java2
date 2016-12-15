//abcabcbb -> abc, bbbbb -> b

public int longest(String s) {
	boolean[] flag = new boolean[256];
	
	int result =0;
	int start =0;
	char[] arr = s.toCharArray();
	
	for(int i=0; i <arr.length; i++) {
		char current = arr[i];
		if (flag[current]) {
			result = Math.max(result, i-start);
			//for example, abccab when it comes to 2nd c, update start from 0 to 3, reset flag for a and b
			for (int j=start; j <i; j++) {
				if (arr[j] == c) {
					start = j+1;
					break;
				}
				//reset
				flag[arr[j]]  = false;
			}
			
		} else {
			flag[current] = true;
		}	
	}
	
	//the rest contain all unique chars so check length
	result = Math.max(result, arr.length-start);
	return result;
}