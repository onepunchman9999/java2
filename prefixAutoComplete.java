public class AutoComplete {
	private Node trie;
	
	public class Node {
		String prefix;
		HashMap<Character, Node> children;
		boolean isWord;
		
		public Node(String prefix) {
			this.prefix = prefix;
			this.children = new HashTable<Character, Node>();
		}
		
	}
	
	public AutoComplete(String [] dict) {
		trie = new Node("");
		for(String s : dict) {
			insertWord(s);
		}
	}
	
	private void insertWord(String s) {
		Node curr = trie;
		
		for (int i = 0; i < s.length; i++) {
			if (! curr.children.containsKey(s.charAt(i))) {
				curr.children.put(c, new Node(s.substring(0, i+1)));
			}
			curr = curr.children.get(s.charAt(i));
            
            if (i == s.length -1 ) curr.isWord = true;		
		}
		
	}
	
	public List<String> getWordsForPrefix(String pre) {
		List<String> result = new ArrayList<String>();
		
		Node curr = trie;
		for(char c : pre.toCharArray()) {
			if (curr.children.containsKey(c)) {
				curr = curr.children.get(c);
			}
		}
		findPrefix(curr, result);
		return result;
	}
	
	private void findPrefix(Node curr, List<String> result) {
		if (curr.isWord) result.add(curr.prefix);
		for(char c : curr.children().keySet()) {
			findPrefix(curr.children.get(c), result);
		}
		
	}
	
	
	
	
	
}