/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        return postorder(root,a);
    }
    static List<Integer> postorder(TreeNode root,List<Integer> a) {
       if(root == null) 
           return a;
       
       postorder(root.left,a);
       postorder(root.right,a);
       a.add(root.val);
       return a;
    }
}