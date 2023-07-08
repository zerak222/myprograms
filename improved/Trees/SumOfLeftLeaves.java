/*
Given a binary tree, find and return the sum of node value of all left leaves in it.
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3
   
Output 1:

 24
Output 2:

 9
*/

public class Solution{
	public int solve(TreeNode A){
		if(A==null){
			return 0;
		}
		int sum = 0;
		if(A.left!=null && A.left.left!=null && A.left.right!=null){
			sum = A.left.val;
		}
		sum+=solve(A.left);
		sum+=solve(A.right);
		return sum;
	}
}