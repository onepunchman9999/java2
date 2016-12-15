//given array of non negative integers, arrange them such that they form a largest number

public String largestNumber(int[] nums) {
	String[] arr = new String[nums.length];
	for(int i=0; i<nums.length; i++) {
		arr[i] = String.valueOf(nums[i]);
	}

	Arrays.sort(new Comparator<String> {
		public int compare(String a, String b) {
				return (a+b).compareTo(b+a);
		}
	});
	
	StringBuilder sb = new StringBuilder();
	for(String s: arr) {
		sb.append(s);
	}
	
	//remove leading 0s
	while(sb.charAt(0)=='0' && sb.length()>1) {
		sb.deleteCharAt(0);
	}
	
	return sb.toString();
}