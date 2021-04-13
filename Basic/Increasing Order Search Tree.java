/*Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, 
and every node has no left child and only one right child.*/

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
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)
            return null;
        
        TreeNode left = increasingBST(root.left);
        TreeNode right = increasingBST(root.right);
        
        root.left = null;
        root.right = right;
        
        if(left==null)
            return root;
        
        TreeNode temp = left;
        while(temp.right!=null)
            temp = temp.right;
        temp.right = root;
        return left;        
    }
}
