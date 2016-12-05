//print longest word made of other words in the list

public String print(String[] arr) {
	HashMap<String, Boolean> map = new HashMap<String, Boolean>();
	for(String str: arr) {
		map.put(str, true);
	}
	
	Arrays.sort(arr, new LengthComparator());
	
	for (String s: arr) {
		if (canBuildWord(s, true, map)) {
			System.out.println(s);
			return s;
		}
	}
	
	return "";
}

public void canBuildWord(String str, HashMap<String, Boolean> map, boolean isOriginal) {
	//base case
	if (map.containsKey(str) && !isOriginal) {
		return map.get(str);
	}
	
	//check every possible combination
	for (int i=1; i < str.length; i++) {
		String left = str.substring(0, i);
		String right = str.substring(i);
		
		if (map.containsKey(left) && map.get(left) == true && canBuildWord(right, map, false)) {
			return true;
		}
	}
	
	map.put(str, false);
	return false;
}