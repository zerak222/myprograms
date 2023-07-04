/*
Given a binary tree A, invert the binary tree and return it.

Inverting refers to making the left child the right child and vice versa.

Input 1:

 
     1
   /   \
  2     3
Input 2:

 
     1
   /   \
  2     3
 / \   / \
4   5 6   7

Output 1:

 
     1
   /   \
  3     2
Output 2:

 
     1
   /   \
  3     2
 / \   / \
7   6 5   4
*/

public class Solution{
	public TreeNode invertTree(TreeNode A){
		if(A==null){
			return A;
		}
		TreeNode dummy = A.left;
		A.left = A.right;
		A.right = dummy;
		invertTree(A.left);
		invertTree(A.right);
		return A;
	}
}