/*
Given an array where elements are sorted in ascending order, convert it to a height Balanced Binary Search Tree (BBST).

Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Input 1:

 A : [1, 2, 3]
Input 2:

 A : [1, 2, 3, 5, 10]


Example Output
Output 1:

      2
    /   \
   1     3
Output 2:

      3
    /   \
   2     5
  /       \
 1         10
 
 
*/

public class Solution{
		
	public TreeNode sortedArrayToBST(int A[]){
		return constructBST(A,0,A.length-1);
	}
	public TreeNode constructBST(int A[],int low,int high){
		if(low>high){
			return null;
		}
		int mid = (low+high)/2;
		TreeNode nn = new TreeNode(A[mid]);
		nn.left = constructBST(A,low,mid-1);
		nn.right= constructBST(A,mid+1,high);
		return nn;
	}
}