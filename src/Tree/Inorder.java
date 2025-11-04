package Tree;

import java.util.*;

public class Inorder {
    int val;
    Inorder left;
    Inorder right;

    Inorder() {}
    Inorder(int val) 
    { 
    	this.val = val; 
    }
    Inorder(int val, Inorder left, Inorder right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solutions {
    public List<Integer> inorderTraversal(Inorder root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(Inorder node, List<Integer> res) {
        if (node == null) 
        	return;
        traverse(node.left, res);
        res.add(node.val);
        traverse(node.right, res);
    }
}
