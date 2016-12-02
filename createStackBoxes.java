public ArrayList<Box> createStackBoxes(Box[] boxes, Box bottom) {
	ArrayList<Box> maxStack = null;
	
	for (int i=0; i < boxes.length; i++) {
		if (boxes[i].canBeOnTop(bottom)) {
			ArrayList<Box> newLocalStack  = createStackBoxes(boxes, boxes[i]); //recurse and see there are boxes that can be on top of boxes[i]
			if (newLocalStack.size() > maxStack.size()) {
				maxStack = newLocalStack; // update local max stack
			}
		}
	}
	
	if (maxStack == null) {
		maxStack = new ArrayList<Box>();
	}
	
	if (bottom != null)
		maxStack.add(0, bottom);
	
	return maxStack;
}