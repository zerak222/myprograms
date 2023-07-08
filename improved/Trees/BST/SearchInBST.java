/*
Problem Description
Given a Binary Search Tree A. Check whether there exists a node with value B in the BST.


Input 1:

            15
          /    \
        12      20
        / \    /  \
       10  14  16  27
      /
     8

     B = 16
Input 2:

            8
           / \
          6  21
         / \
        1   7

     B = 9
	 
Output 1:

 1
Output 2:

 0
*/

public class Solution{
	public int solve(TreeNode A, int B){
		if(A==null){
			return 0;
		}
		if(A.val==B){
			return 1;
		}
		if(A.val>B){
			// move left
			return solve(A.left,B);
		}
		if(A.val<B){
			// move right
			return solve(A.right,B);
		}
		return 0;
	}
}