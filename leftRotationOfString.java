//left rotation of string
//rotate a string to the left with number n
//abcdef and 2 -> 
//ba cdefg (reverse 1st part)
//ba gfedc (reverse 2nd part)
//cdefg ab (reverse whole)

public void leftRotateString(String str, int n) {
	int length = str.length;
	
	int first = 0;
	int firstEnd = 0 + n -1;
	int second = n;
	int secondEnd = 0 + length -1;
	
	reverse(str, first, firstEnd);
	reverse(str, second, secondEnd);
	reverse(str, first, secondEnd);
}