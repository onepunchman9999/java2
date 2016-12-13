//printing last K lines from a file
//take a buffer of size K and fill butffer with data in a circular fashion. If the buffer is full, replace oldest entry in the buffer with the new entry
//by reading and wrapping around, and going back to the beginning of the buffer and overwriting the previous entries as they are no longer the last  k lines.

public void lastKLines() {
	Scanner reader = new Scanner(System.in);
	String filePath = reader.nextLine();
	
	Scanner fileReader = new Scanner(new FileReader(filePath));
	
	int kLines = Integer.parseInt(reader.nextLine);
	//initialized with kLines to use wrapping
	String [] arrayLines = new String[kLines];
	
	//total number of lines in the file
	int nLines = 0;
	int index = 0;
	
	if (kLines > 0) {
		while(fileReader.hasNext()) {
			arrayLines[index] = fileReader.nextLine();
			//wrap arouund and store
			index = (index + 1) % kLines;
			nLines++;
		}
	}
	
	//the file contains less number of lines that k lines
	if(nLines < kLines) {
		for(int i=0; i < nLines; i++) {
			System.out.println(arrayLines[i]);
		} 
	} else {
		//the file contains line numbers more than k
		//use index to find out
		for(int i=0; i< kLines; i++) {
			System.out.println(arrayLines[index]);
			index = (index+1) % kLines;
		}
	}
	
	
}

//nLines = 7 (a,b,c,d,e,f,g) , kLines =5

//f
//g <--index
//c
//d
//e

//a and b are overriden since buffer contains 5