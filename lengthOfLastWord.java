//given a string s consisting of upper/lowercase alphabets and an empty space character, return the length of last word in a string
//use state machine such that we flag to mark the start of letter from the end. If a letter starts and it is not a letter, return length

public int length(String s) {
	if (s == null || s.length == 0) {
		return 0;
	}
	
	int result = 0;
	for(int i = s.length -1; i >=0; i--) {
		char c = s.charAt(i);
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			flag = true; //start of letter
			result++;
		} else {
			//was there a valid letter beforehand?
			if (flag) {
				return result;
			}
		}
	}
	return result;
	
}