//print longest word made of two words in the list
public String print(String [] list) {
	Arrays.sort(list, new LengthComparator());
	HashMap<String, Boolean> map = new HashMap<String, Boolean>();
	for(String str : list) {
		map.put(str, true);
	}
	
	for(String str: list) {
		for(int i=1; i<str.length; i++) {
			String left = str.substring(0, i);
			String right = str.substring(i);
			if (map.get(left) == true && map.get(right) == true) {
				return s;
			}
		}
	}
	
	return "";
}