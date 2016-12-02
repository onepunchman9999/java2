//"iresetthecomputer", given a dictionary(a list of words), find an optimal way to unconcatenate a sequence of words.
//p(thit)
// = min(t + p(hit), p(th it))

//p(th it)
// = min(th + p(it), p(thi t)

//two cases exist
//1. insert a space after this character
//2. ignore and do not insert a space after this character and thus extend

public int parse(int start, int end) {
	if (end >= sentence.length)
		return end - start;
	}
	
	String str = sentence.substring(start, end+1); //start index, end index
	//break the word and recurse with the rest
	int n1 = parse(start+1, end+1);
	if (!map.contains(str)) {
		//add n from recursion plus the length of current invalid str
		n1 = n1 + str.length;
	}
	
	//extend
	int n2 = parse(start, end+1);
	
	//return the minmum of two cases above
	return Math.min(n1, n2);
}