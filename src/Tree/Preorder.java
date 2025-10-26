// LeetCode 144: Binary Tree Preorder Traversal
// Approach: Iterative using Stack


package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PreorderNode {
    
	int val;
    PreorderNode left;
    PreorderNode right;
    
    PreorderNode() 
    { 
    	
    }
    
    PreorderNode(int val) 
    {
    	this.val = val; 
    }
    
    PreorderNode(int val, PreorderNode left, PreorderNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> preorderTraversal(PreorderNode root) 
    {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<PreorderNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            PreorderNode node = stack.pop();
            result.add(node.val);

            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }

        return result;
    }
}

public class Preorder {
    public static void main(String[] args) {
        Solution sol = new Solution();

        PreorderNode root = new PreorderNode(1);
        root.right = new PreorderNode(2);
        root.right.left = new PreorderNode(3);

        List<Integer> output = sol.preorderTraversal(root);
        System.out.println(output);
    }
}
