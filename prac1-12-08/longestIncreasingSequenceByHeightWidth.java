public void longestSequence(List<Node> list, int index, List<List> solutions) {
	if (index > list.length)
		return;

	List bestSeq = null;
	Node current = list[index];

	for(int i=0; i < index; i++) {
		if (list[i].isBefore(current)) {
			bestSeq = Math.max(solutions[i], bestSeq);		
		}	
	}
	
	List<Node> solution = new ArrayList();
	solution.addAll(bestSeq);
	solution.add(current);
	solutions[index] = solution;
	longestSequence(list, index+1, solutions);
}
