public int convertToBase(String number, int base) {
	int value = 0;
    
	//from 1, 10, 100, ...
	for (int i= number.length-1; i>=0; i--) {
		int digit = digitToValue(number.charAt(i));
		int exp = number.length -i -1;
		value += digit * Math.power(base, exp);
	}
	
	return value;
}

public int digitToValue(char c) {
	if (c >= '0' && c <= '9') return c - '0';
	else if (c >= 'a' && c <= 'f') return 10 + c - 'a';
	else if (c >= 'A' && c <= 'F') return 10 + c - 'A';
}