//larget bst subtree


// for convinience
public class wrapper {
	int size;
	int lower;
	int upper;
	boolean isBST;
	
	public wrapper() {
		lower = Integer.MAX_VALUE;
		upper = Integer.MIN_VALUE;
		isBST = false;
		size = 0;
	}
}


public class BST {
	public int largestBSTSubtree(Node root) {
		return helper(root).size;
	}
	
	public Wrapper helper(Node node) {
		Wrapper curr = new Wrapper();
		if (node == null) {
			curr.isBST = true;
			return curr;
		}
		
		Wrapper left = helper(node.left);
		Wrapper right = helper(node.right);
		//in the case of parent leaf node (returnd by both null children), we get a wrapper back that contains the size of 0 and isBST set as true
		//And then this is how size is calculated by incrementing by one
		
		//current subtree boundaries
		curr.lower = Math.min(node.val, left.lower);
		curr.upper = Math.max(node.val, right.upper);
		
		if (left.isBST && right.isBST && left.upper <= node.value && node.value <= right.lower) {
			curr.size = left.size + right.size + 1;
			curr.isBST = true;
		} else {
			curr.size = Math.max(left.size, right.size);
			curr.isBST = false;
		}
	
		return curr;
	
	}


}