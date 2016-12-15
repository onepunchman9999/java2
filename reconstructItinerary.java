//Given paris of departure and arrival airports [from, to], reconstruct itinerary in order
//The itinerary begins with JFK
public class Solution {
	HashMap<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
	List<String> result = new LinkedList<String>();

	public void reconstruct(String[][] tickets) {
		HashMap<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
		List<String> result = new LinkedList<String>();
		
		for(String[] ticket: tickets) {
			if (!map.contains(ticket[0])) {
				PriorityQueue<String> q = new PriorityQueue<String>();
				map.put(ticket, q);
			} 
			map.get(ticket[0]).offer(ticket[1]);
		}
		
		dfs("JFK");
		return result;	
	}
	
	//a -> b
	//b -> e
	//e -> g
	//search till end and add to front in reverse visited order
	g
	e g
    b e g
    a b e g	
	
	//a -> b, c
	//b -> e
	//e -> g
	//dfs wil make sure search through till the end for that element and once done, it will move to the next one in queue
	g
	e g
    b e g
    c b e g
    a c b e g 	
	
	public void dfs(String s) {
		PriorityQueue q = map.get(s);
		
		while(q != null && !q.isEmpty()) {
			dfs(q.poll());
		}
		
		result.addFirst(s);
		
	}
	
	
}
