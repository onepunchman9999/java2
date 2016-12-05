//Given string S and an array of smaller strings T, search S for each small string in T.
//S = abc bcd
//a
//                 a(0)               
//               b(0)                              
//             c(0)                   

//b
//                 a(0) b(1)               
//               b(0)     c(1)                         
//              c(0)

//c
//                 a(0) b(1)    c(2)         
//               b(0)     c(1)                         
//              c(0)


//b
//                 a(0)      b(1, 3)       c(2)        
//               b(0)           c(1, 3)                       
//             c(0)               d(3)        

// search for bcd --> from above, return 3           


public class SuffixTreeNode {
	HashMap<Character, SuffixTreeNode> children = new HashMap<Character, SuffixTreeNode>();
	ArrayList<Integer> indexes = new ArrayList<Integer>();
	char value;
	
	public void insertString(String s, int index) {
		indexes.add(index);
		
		SuffixTreeNode child = null;
		if (s != null && s.length > 0) {
			value = s.charAt(0);
			SuffixTreeNode child = null;
			if (children.containsKey(value)) {
				child = children.get(value);
			} else {
				child = new SuffixTreeNode();
				children.put(value, child);
			}
			String remainder = s.substring(1);
			child.insertString(remainder, index);
		}
	}
	
	public ArrayList<Integer> search(String s) {
		if (s == null || s.length() == 0) {
			return indexes;
		} else {
			char first = s.charAt(0);
			if (children.containsKey(first)) {
				String remainder = s.substring(1);
				return children.get(first).search(remainder);
			}
		}
		
		return null;
	}
}

public class SuffixTree {
	SuffixTreeNode root = new SuffixTreeNode();
	
	public SuffixTree(String s) {
		for (int i=0; i < s.length; i++) {
			String suffix = s.substring(1);
			root.insertString(suffix, i);
		}
	}
	
	public ArrayList<Integer> search(String s) {
		return root.search(s);
	}
}