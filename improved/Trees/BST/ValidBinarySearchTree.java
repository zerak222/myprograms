/*
Problem Description
You are given a binary tree represented by root A. You need to check if it is a Binary Search Tree or not.

Assume a BST is defined as follows:

1) The left subtree of a node contains only nodes with keys less than the node's key.

2) The right subtree of a node contains only nodes with keys greater than the node's key.

3) Both the left and right subtrees must also be binary searc

Input 1:

 
   1
  /  \
 2    3
 
Input 2:

 
  2
 / \
1   3

Output 1:

 0
 
Output 2:

 1

*/
public class Solution{
	int prev = Integer.MIN_VALUE;
	int ans = 1;
	public int isValidBST(TreeNode A){
		traversal(A);
		return ans;
	}
	public void traversal(TreeNode A){
		if(A==null){
			return ;
		}
		traversal(A.left);
		if(prev>=A.val){
			ans = 0;
			return;
		}
		prev = A.val;
		traversal(A.right);
	}
}