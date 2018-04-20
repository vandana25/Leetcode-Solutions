package Trees;

public class BoundryTraversal {
	
	Node root;
	
	public void display(Node root){
		if(root==null){
			return;
		}
		else {
			System.out.println(root.data);
		}
		displayLeft(root.left);
		displayLeaves(root);
		displayRight(root.right);
	}
	public void displayRight(Node root){
		if(root==null)
			return;
		else if(root.right!=null) {
			displayRight(root.right);
			System.out.println(root.data);
		}
		else if(root.left!=null){
			displayRight(root.right);
			System.out.println(root.data);
		}
	}
	
	
	public void displayLeft(Node root){
		if(root==null){
			return;
		}
		if(root.left!=null){
			System.out.println(root.data);
			displayLeft(root.left);
		}
		else if(root.right!=null){
			System.out.println(root.data);
			displayLeft(root.left);
		}
	
		
		
	}
	public void displayLeaves(Node root){
		if(root==null)
			return;
		else if(root.left==null && root.right==null){
			System.out.println(root.data);
		}
		else {
			displayLeaves(root.left);
			displayLeaves(root.right);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoundryTraversal tree = new BoundryTraversal();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.root.right.right.right = new Node(93);
        tree.root.right.right.left = new Node(63);
        
        tree.display(tree.root);
	}

}
