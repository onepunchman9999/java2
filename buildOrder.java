//build order - topological sort

public List<Integer> buildOrder(int [][] processes) {
	Set<Integer> tempMarks = new HashSet<Integer>();
	Set<Integer> permMarks = new HashSet<Integer>();
	List<Integer> result = new ArrayList<Integer>();
	
	for (int i =0; i < processes.length; i++) {
		if (!permMars.contains(i))
			visit(i, processes, tempMarks, permMarks, result);
	}
	
	return result;
}

public void visit(int process, int [][] processes, List<Integer> tempMarks, List<Integer> parmMarks, List<Integer> result) {
	if (tempMarks.contains(process)) throw new RunTimeException(); //cycle
	if (!permMarks.contains(process)) {
		tempMarks.add(process);
		
		for (int p : processes[process]) {
			if (!tempMarks.contains)
			  visit(p, processes, tempMarks, permMarks)
		}
		
		tempMarks.remove(process);
		permMarks.add(process);
		result.add(process);
	}
	
}