package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTLevelOrderTraversal {
	static TreeNode root;

	public static void traversal(TreeNode root){
		if(root==null)
			return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<Integer> list = new ArrayList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			root=queue.poll();
			list.add(root.val);
		//	System.out.println(root.val);
			if(root.left!=null){
				queue.add(root.left);
			}
			if(root.right!=null){
				queue.add(root.right);
			}
			
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		
		BSTLevelOrderTraversal tree = new BSTLevelOrderTraversal();
        tree.root = new TreeNode(8);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(10);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(6);
        tree.root.right.right = new TreeNode(14);
        traversal(root);
	}

}
