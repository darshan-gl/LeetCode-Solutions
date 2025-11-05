package Tree;


import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) 
    {
    	this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MinumDepth {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(left==0) return right+1;
        if(right==0) return left+1;
        return Math.min(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20,new TreeNode(15),new TreeNode(7));

        MinumDepth  s=new MinumDepth ();
        System.out.println("Minimum Depth: "+s.minDepth(root));
    }
}
