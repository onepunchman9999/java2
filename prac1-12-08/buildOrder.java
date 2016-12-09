public List<Integer> buildOrder(int[][] processes) {
	HashSet<Integer> tempMarks = new HashSet<Integer>();
	HashSet<Integer> permMarks = new HashSet<Integer>();
	List<Integer> result = new LinkedList<Integer>();

	for(int i=0; i < processes.length; i++) {
		if (!permMarks.contains(i)) {
			visit(i, processes, tempMarks, permMarks, result)		
		}
	}

	return result;
}


public void visit(int process, int[][] processes, HashSet tempMarks, HashSet permMarks, List result) {
	if (tempMarks.contains(process))
		return new RuntimeException();

	if (!permMarks.contains(process)) {
		tempMarks.add(process);
		
		for(int p: processes[process]) {
			visit(p, processes, tempMarks, permMarks, result);
		}
		
        //[ [3][2], [3][5] ] [2][1]. [1][0]
        // after call into 2 from 3, 1 fom 2, 0 from 1 --> print 0
		tempMarks.remove(process);
		permMarks.add(process);
		result.add(process); // in case of 0, 0 is prcessed
	}

}
