/*
	Given the root of a binary tree A. Return the sum of all the nodes of the binary tree.
	
	Input 1:

 A =   2                 
      / \                           
     1   4            
    /                           
   5


Input 2:

A =   3
      / \
      6  1
      \   \
       2   7
	   
Output 1:

	12
Output 2:

	19  
*/

public class Solution{
	public int solve(TreeNode A){
		if(A==null){
		    return 0;	
		}
		int lSize = solve(A.left);
		int rSize = solve(A.right);
		return lSize+rSize+A.val;
	}
}