package Trees;
import java.util.ArrayList;
import java.util.List;

public class KthMinElement {
	static TreeNode root;
	List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
    	findEle(root);
    	return list.get(k);
    	
    	
    }
    public void findEle(TreeNode root){
    	if(root==null){
    		return ;
    	}
    	else{
    		findEle(root.left);
    		list.add(root.val);
    		findEle(root.right);
    	}
		
    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthMinElement tree = new KthMinElement();
        tree.root = new TreeNode(8);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(10);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(6);
        tree.root.right.right = new TreeNode(14);
        tree.kthSmallest(root, 3);
        
	}

}
