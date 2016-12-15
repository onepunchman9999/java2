//read n characters given Read4

public int read(int n) {
	char[] buffer = new char[n];
	char[] read4Buffer = new char[4];
	int total = 0;
	
	while(true) {
		int c = Read4(read4Buffer);
		
		if (c ==0) break;
		
		c = Math.min(n-total, c);
		
		for(i=0; i <count; i++) {
			buffer[total++] = read4Buffer[i];
		}	
	}
	
	return total;
}