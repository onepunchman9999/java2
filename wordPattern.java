//given pattern and a string str, find if str follows the same pattern

public boolean pattern(String pattern, String str) {
	String[] arr = str.split(" ");
	
	if (arr.length != pattern.lenth()) return false;
	
	HashMap<Character, String> map = new HashMap<Character, String>();
	
	for(int i=0; i < pattern.length; i++) {
		char c = pattern.charAt(i);
		if (map.containsKey(c)) {
			String s = map.get(c);
			if (!s.equals(arr[i])) {
				return false;
			}
		} else if (map.containsValue(arr[i]) {
			//it's a new character. its value should not be used anywhere else in the map.
			//pattern: food -> str: aaa ddd ddd eee (success case)
			//fail case below: o is new but aaa is already in map
			//f aaa
			//o aaa
			return false;
		}
		
		map.put(c, arr[i]);	
	}
	
	return true;
		
}