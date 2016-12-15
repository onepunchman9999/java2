//given two strings s and t, determine if the characters in s can be replaced to get t
//egg and add are isomorphic

public boolean pattern(String s, String t) {

	if (s.length != t.lenth()) return false;
	
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	
	for(int i=0; i < s.length; i++) {
		char c1 = s.charAt(i);
		char c2 = t.charAt(i);
		if (map.containsKey(c1)) {
			if (map.get(c1) != c2)) {
				return false;
			}
		} else if (map.containsValue(c2) {
			//it's a new character. its value should not be used anywhere else in the map.
			//pattern: food -> str: aaa ddd ddd eee (success case)
			//fail case below: o is new but aaa is already in map
			//f aaa
			//o aaa
			return false;
		}
		
		map.put(c1, c2);	
	}
	
	return true;
		
}