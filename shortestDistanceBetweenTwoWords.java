//Given any two words, find the shortest distance (in terms of number of words) betwen them in text

public int find(String[] words, String word1, String word2) {
	int min = Math.MAX_VALUE;
	int lastPosWord1 = -1;
	int lastPosWord2 = -1;
	
	for (int i=0; i < words.length; i++) {
		String currentWord = words[i];
		
		if (currentWord.equals(word1)) {
			lastPosWord1 = i;
		} else if (currentWord.equals(word2)) {
			lastPosWord2 = i;
			int distance = lastPosWord2 - lastPosWord1;
			if (lastPosWord1 >=0) {
				min = Math.min(min, distance);
			}
		}
	    
	}
	
	
	
}