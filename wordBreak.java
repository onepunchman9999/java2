//given a string s and a dictionary of words dict, find if s can be segmented into a space seperated sequence of one or more words
//s = "abcdef" , dict=["abc","def"]
public boolean wordBreak(String s, Set<String> dict){
	return wordBreakHelper(s, dict, 0);
}

public boolean wordBreakHelper(String s, Set<String> dict, int start) {
	if (start == s.length()) return true;
	
	for(String s: dict) {
		//for each word, if contained, recurse
		int len = s.length;
		//make sure we get end from start
		int end = start + len;
		if (end > s.length()) continue;
		
		if (s.equals(s.substring(start, end))) {
			if (wordBreakHelper(s, dict, start + len)) {
				return true;
			}
		}	
	}
	return false;
}

