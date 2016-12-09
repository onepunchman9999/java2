public List<Box> createStack(Box [] boxes, Box box) {
	List<Box> bestSeq = null;
	for (int i=0; i < boxes.length; i++) {
		if (boxes[i].onTop(box) {
			List<Box> sol = createStack(boxes, boxes[i]);
			bestSeq = Math.max(bestSeq, sol);
		}
	}
	
	if (bestSeq == null)
		bestSeq = new LinkedList();

	bestSeq.add(0, box);
	return bestSeq;
}
