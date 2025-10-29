package Tree;
//LeetCode 145: Binary Tree Postorder Traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class PostorderNode {
 
 int val;
 PostorderNode left;
 PostorderNode right;
 
 PostorderNode() 
 { 
 	
 }
 
 PostorderNode(int val) 
 {
 	this.val = val; 
 }
 
 PostorderNode(int val, PostorderNode left, PostorderNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
 }
}

class SolutionPost {
 public List<Integer> postorderTraversal(PostorderNode root) 
 {
     LinkedList<Integer> result = new LinkedList<>();
     if (root == null)
         return result;

     Stack<PostorderNode> stack = new Stack<>();
     stack.push(root);

     while (!stack.isEmpty()) {
         PostorderNode node = stack.pop();
         result.addFirst(node.val);

         if (node.left != null)
             stack.push(node.left);
         if (node.right != null)
             stack.push(node.right);
     }

     return result;
 }
}

public class Postorder {
 public static void main(String[] args) {
     SolutionPost sol = new SolutionPost();

     PostorderNode root = new PostorderNode(1);
     root.right = new PostorderNode(2);
     root.right.left = new PostorderNode(3);

     List<Integer> output = sol.postorderTraversal(root);
     System.out.println(output);
 }
}
