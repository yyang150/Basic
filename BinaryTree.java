class BinaryTree{
	private TreeNode<T>{
		T data;
		TreeNode<T> parent;
		TreeNode<T> left;
		TreeNode<T> right;

		TreeNode(T data){
			this.data = data;
		}


	}

	public TreeNode<T> root;

	public int height(){
		return height(root);
	}

	private int height(TreeNode<T> tree){
		if(tree == null){
			return 0;
		}
		return 1 + Max(height(tree.left), height(tree.right));
	}

	public int numNodes(){
		return numNodes(root);
	}

	private int numNodes(TreeNode<T> tree){
		if(tree == null){
			return 0;
		}
		return 1 + numNodes(tree.left) + numNodes(tree.right);
	}
}