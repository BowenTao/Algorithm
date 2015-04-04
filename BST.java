
public class BST {
	public static class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val){
			this.val=val;
			left=null;
			right=null;
		}
	}
		
	public static class BinarySearchTree{
		Node root;
		
		public BinarySearchTree(){
			root=null;
		}
		
		public boolean isEmpty(){
			return root==null;
		}
		
		public void insert(int val){
				root=insert(root, val);
		}
		
		private Node insert(Node n, int val){
			if (n==null){
				n=new Node(val);
			}else{
				if (n.val>val){
					n.left=insert(n.left, val);
				}else if (n.val<val){
					n.right=insert(n.right, val);
				}else{
					System.out.println("Error!");
					return null;// value collision, clear the whole tree 
				}
			}
			return n;
		}
		
		public boolean search(int val){
			if (isEmpty()){
				System.out.println("Tree is empty!");
				return false;
			}else{
				return search(root, val); 
			}
		}
		
		private boolean search(Node n, int val){
			if (n.val==val){
				return true;
			}
			if (val<n.val){
				if (n.left==null){
					return false;
				}else{
					return search(n.left, val);
				}
			}else{
				if (n.right==null){
					return false;
				}else{
					return search(n.right, val);
				}
			}
		}
		
		public void delete(int val){
			if(isEmpty()){
				System.out.println("Tree is empty!");
			}else if (!search(val)){
				System.out.println(val+" isn't in the tree!");
			}else{
				root=delete(root, val);
			}
		}
		
		private Node delete(Node n, int val){
			Node p,p1;
			Node temp;
			if (n.val==val){	
				if (n.left==null && n.right==null){
					return null;
				}else if (n.left==null){
					p=n.right;
					return p;
				}else if (n.right==null){
					p=n.left;
					return p;
				}else{
					p=n.right;
					p1=n.right;
					while(p.left!=null){
						p=p.left;
					}
					p.left=n.left;
					return p1;
				}
			}
			if (n.val>val){
				temp=delete(n.left, val);
				n.left=temp;
			}else{
				temp=delete(n.right, val);
				n.right=temp;
			}
			return n;
		}
		
		public int count(){
			return count(root);
		}
		
		private int count(Node n){
			if (n==null){
				return 0;
			}else{
				int a=1;
				a+=count(n.left);
				a+=count(n.right);
				return a;
			}
		}
		
		public void inorder(){
			inorder(root);
		}
		
		private void inorder(Node n){
			if (n!=null){
				inorder(n.left);
				System.out.print(n.val+" ");
				inorder(n.right);
			}
		}
		
		public void preorder(){
			preorder(root);
		}
		
		private void preorder(Node n){
			if (n!=null){
				System.out.print(n.val+" ");
				preorder(n.left);
				preorder(n.right);
			}
		}
		
		public void postorder(){
			postorder(root);
		}
		
		private void postorder(Node n){
			if (n!=null){
				postorder(n.left);
				postorder(n.right);
				System.out.print(n.val+" ");
			}
		}
		
	}
	
	public static void main(String[] args){
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(10);
		tree.insert(1);
		tree.insert(14);
		tree.insert(4);
		tree.insert(6);
		tree.insert(32);
		tree.insert(87);
		tree.insert(0);
		tree.insert(2);
		
		System.out.println(tree.count());
		System.out.println(tree.search(4));
		System.out.println(tree.search(3));
		tree.inorder();
		System.out.println();
		tree.preorder();
		System.out.println();
		tree.postorder();
		tree.delete(10);
		System.out.println();
		System.out.println();
		tree.inorder();
		System.out.println();
		tree.preorder();
		System.out.println();
		tree.postorder();
		
	}
	
	
}
