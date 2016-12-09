//build order - topological sort
//processes[][] -> [0][dependency list]

//       - 1 <-- \
// 0 <--           <-- 3 <-- 4
//       - 2 <-- /

//tempMarks = {3}
//permMarks = {0, 1, 2}
//results = {0, 1, 2}
//visit(3, ...)  --------------> visit(2, ....) ------>


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
		
		for (int p : processes[process]) { //get dependency for process
			visit(p, processes, tempMarks, permMarks)
		}
		
		tempMarks.remove(process);
		permMarks.add(process);
		result.add(process);
	}
	
}