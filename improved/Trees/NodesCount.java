/*
You are given the root node of a binary tree A. You have to find the number of nodes in this tree.

Input 1:

 Values =  1 
          / \     
         4   3                        
Input 2:

 
 Values =  1      
          / \     
         4   3                       
        /         
       2     
	   
Output 1:

 3 
Output 2:

 4 

*/

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
 
 public class Solution{
	public int solve(TreeNode A){
		int count = countNodes(A);
		return count; 
	}
	public int countNodes(TreeNode A){
		if(A==null){
		    return 0;
		}
		int count = 0;
		int leftCount = countNodes(A.left);
		int rightCount = countNodes(A.right);
		return leftCount+rightCount+1;
	}
 }