class BinarySearchTree{
	private class BSTNode{
		public Comparable data;
		public BSTNode left;
		public BSTNode right;

		BSTNode(Comparable newdata){
			data = newdata;
		}
	}

	private BSTNode root;


	public void levelOrder(){
		Queue <BSTNode> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty()){
			BSTNode curr = q.remove();
			if(curr != null){
				curr.visit();
				q.add(curr.left);
				q.add(curr.right);

			}
		}
	}

	public boolean find(Comparable elem){
		return find(root,elem);
	}

	//recursion
	public Comparable minimum(BSTNode tree){
		if(tree == null){
			return null;
		}
		if(tree.left == null){
			return tree.data;
		}else{
			return minimum(tree.left);
		}
	}

	//iteration
	public Comparable minimum(BSTNode tree){
		BSTNode curr = tree;
		while(curr != null){
			if(curr.left == null){
				return curr.data;
			}else{
				curr = curr.left;
			}
		}

		return null;
	}

	//recursion 
	private boolean find(BSTNode tree, Comparable elem){
		if(tree == null)
			return false;
		if(elem.compareTo(tree.data) == 0)
			return true;
		if(elem.compareTo(tree.data) < 0){
			return find(tree.left, elem);
		}else{
			return find(tree.right, elem);
		}
	}

	//iteration
	private boolean find(BSTNode tree, Comparable elem){
		BSTNode curr = tree;
		int comp;
		while(curr != null){
			comp = elem.compareTo(curr.data);
			if(comp < 0){
				curr = curr.left;
			}else if(comp > 0){
				curr = curr.right;
			}else{
				return true;
			}
		}

		return false;
	}


	public void insert(Comparable elem){
		insert(root,elem);
	}

	//recursion
	private BSTNode insert(BSTNode tree, Comparable elem){
		if(tree == null){
			return new BSTNode(elem);
		}
		if(elem.compareTo(tree.data) < 0){
			tree.left = insert(tree.left,elem);
			return tree;
		}else{
			tree.right = insert(tree.right,elem);
			return tree;
		}
	}

	//iteration
	private BSTNode insert(BSTNode tree, Comparable elem){
		BSTNode curr = tree;
		int cmp;
		while(curr != null){
			cmp = elem.compareTo(curr.data);
			if(cmp > 0){
				curr = curr.right;
			}else{
				curr = curr.left;
			}
		}

		curr = new BSTNode(elem);

		return curr;
	}


	public void delete(Comparable elem){
		root = delete(root, elem);
	}

	private BSTNode delete(BSTNode tree, Comparable elem){
		if(tree == null){
			return null;
		}
		if(tree.data.compareTo(elem) == 0){
			if(tree.left == null){
				return tree.right;
			}else if(tree.right == null){
				return tree.left;
			}eles{
				
			}
		}
	}
	
}