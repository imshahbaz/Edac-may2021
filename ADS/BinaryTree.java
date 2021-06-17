public class BinaryTree {
	Node root;
	static class Node{
		int key;
		Node left,right;
		public Node(int a) {
			key=a;
			left=right=null;
		}
	}
void insert(Node n,Node i) {
	if(i.key<n.key) {
		if(n.left!=null) {
			insert(n.left,i);
		}
		else {
			System.out.println("  Inserted " + i.key + " to left of "+n.key);
			n.left=i;}
	}
	else if(i.key>n.key) {
		if(n.right!=null) {
			insert(n.right,i);
		}
		else {
			System.out.println("  Inserted " + i.key + " to right of "+n.key);
			n.right=i;}
	}
}




	void add(int a) {
		Node newNode=new Node(a);
		if(root==null) {
			root=newNode;
		}
		else
			insert(root,newNode);
	}
	
	void InOrdertraverse(Node n) {
		if(n!=null) {
			InOrdertraverse(n.left);
			System.out.print(" "+n.key);
			InOrdertraverse(n.right);
		}
	}
	void PreOrdertraverse(Node n) {
		if(n!=null) {
			System.out.print(" "+n.key);
			PreOrdertraverse(n.left);
			PreOrdertraverse(n.right);
		}
	}
	
	void PostOrdertraverse(Node n) {
		if(n!=null) {
			PostOrdertraverse(n.left);
			PostOrdertraverse(n.right);
			System.out.print(" "+n.key);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree tree=new BinaryTree();
tree.add(5);
tree.add(2);
tree.add(4);
tree.add(8);
tree.add(6);
tree.add(7);
tree.add(3);
tree.add(9);
System.out.println(tree.root.key);
System.out.println("--------------------");
tree.InOrdertraverse(tree.root);
System.out.println("\n--------------------");
tree.PreOrdertraverse(tree.root);
System.out.println("\n--------------------");
System.out.println(tree.root.left.key);
	}

}
