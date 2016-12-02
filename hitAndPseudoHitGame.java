//actual solution: RGBY and you guess GGRR, you have one hit and one pseudo hit
//hit - guess a color for the correcr slot
//pseudo hit - guess a color that exists but is in a wrong slot

public class Result {
	public int hits = 0;
	public int pseudoHits = 0;
}

public int code(char c) {
	if (c == 'R') {
		return 0;
	} else if (c == 'G') {
		return 1;
	} else if (c == 'B') {
		return 2;
	} else if (c == 'Y') {
		return 3;
	} else {
		return -1;
	}
}

public Result solve(String guess, String solution) {
	Result result = new Result();
	int[] frequencies = new int[4];
	for {int i=0; i < guess.length; i++} {
		if (guess.charAt(i) == solution.charAt(i)) {
			result.hits++;
		} else {
			int code = code(guess.charAt(i));
			frequencies[code]++;
		}
	}
	
	for (int i=0; i < guess.length; i++) {
		if (guess.charAt(i) != solution.charAt(i) && code(guess.charAt(i)) > 0 && frequencies[guess.charAt(i)] > 0) {
			frequencies[guess.charAt(i)]--;
			result.pseudoHits++;
		}
	}
	return result;
}