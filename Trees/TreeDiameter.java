// Diameter of tree
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
    private int max1  = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int len=  height(root);
        return max1;
    }
    public int height(TreeNode root){
        if(root == null) return 0;    
        int l = height(root.left);
        int r = height(root.right);
        max1 = Math.max(max1,l+r);
        return Math.max(l,r)+1;
    }

}
