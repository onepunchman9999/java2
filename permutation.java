//abc, acb, ....

public void permutation(String str, int index) {
	if (index == str.length) {
		System.out.println(str);
	}
	
	for(int i = index; i < str.length; i++) {
		//swap str[i] with str[index] as i increments with index as initial value
		//i keeps changing so make it temp preferably
		char temp = str.charAt(i);
		str[i] = str[index];
		str[index] = temp;
		
		permutation(str, index+1);
		
		temp = str.charAt(i);
		str[i] = str[index];
		str[index] = temp;
	}
}