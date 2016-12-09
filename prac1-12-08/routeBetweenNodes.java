
public enum states {
	VISITED, VISITNG, UNVISITED
}
public route(Graph g, Node start, Node end) {

	for (Node n: g.getAdjacentList()) {
		n.state = UNVISITED;
	}

	LinkedList queue = new LinkedList();
	queue.add(start);

	while(!queue.isEmpty()) {
		Node n = queue.pop();

		for(Node p: n.getAdjacentNodes()) {
			if(p.state == UNVISITED && p == end) {
				return true;
			} else {
				p.state = VISITING;
				queue.add(p);
			}
		}
		p.state = VISITED;
	}
	return false;
}
