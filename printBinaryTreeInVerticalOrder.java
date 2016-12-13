//print binary tree in vertical order path
//       1
//   2       3
// 4   5   6    7
//=> [4], [2], [1,5,6], [3], [7]

//do inorder traverse
//take a variable called level, whenever going to left, do level++ and whenever going to right, do level--
//store the elements of each level by creating a TreeMap with level and elements at that level
//print results stored in the TreeMap

//        	      1(0)
//   	   2 (1)         3 (-1)
// 	  4 (2)     5(0)   6 (0)   7 (-2)

//called by vertical(root, 0);

public class VerticalOrder {
	public TreeMap<Integer, ArrayList> map = new TreeMap();
	public int level;
	public ArrayList<Integer> list;
	
	public Node vertical(Node root, int level) {
		if(root == null) {
			return;
		}
		
		Node n = vertical(root.left, --level);
		//reached end of left(recurive returned null so make sure it is the way it was by compensating and adding 1)
		if (n == null) {
			level++;
		}
		
		if (map.get(level) != null) {
			list = map.get(level);
			list.add(root.value);
			map.put(level, list);
		} else {
			list = new ArrayList();
			list.add(root.value);
			map.put(level, list);
		}
		
		return vertical(root.right, ++level);	
	}
	
	public void printResult(TreeMap map) {
		Set<Integer> keys = map.keySet();
		for(Integer k: keys) {
			System.out.println(map.get(k));
		}
	}
	
	
}