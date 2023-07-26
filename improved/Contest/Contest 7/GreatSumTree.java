/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    int sum = 0;
    public TreeNode solve(TreeNode A) {
        if(A==null){
            return null;
        }
        solve(A.right);
        sum = A.val+sum;
        A.val = sum;
        solve(A.left);
        return A;
        
        
        
    }
}
