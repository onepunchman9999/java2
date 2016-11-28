public enum State {
	UNVISITED, VISITING, VISITED;
}

public boolean routeExists(Graph g, Node start, Node end) {
	LinkedList q = new LinkedList();
	
	for (Node u: g.getAllNodes()) {
		u.state = State.UNVISITED;
	}
	
	q.add(start);
	
	while(!q.isEmpty()) {
		Node current = q.remove();
		
		if (current != null) {
			for(Node n: current.getAdajacentNodes()) {
				if (n.state == State.UNVISITED) {
					if (n == end) {
						return true;
					} else {
						n.state = State.VISITING;
						q.add(n);
					}
				}
			}
			current.state = State.VISITED;
		}
	}
	
	return false;
}