/*
Problem Description
Given a binary tree, return the inorder traversal of its nodes' values.

Problem Constraints
1 <= number of nodes <= 105

Example Input
Input 1:

   1
    \
     2
    /
   3
Input 2:

   1
  / \
 6   2
    /
   3
   
Output 1:

 [1, 3, 2]
Output 2:

 [6, 1, 3, 2]

*/

public class Solution{
	
	public int[] inOrderTraversal(TreeNode A){
		ArrayList<Integer> arr = new ArrayList();
		solve(A,arr);
		int ans[] = new int[arr.size()];
		int i=0;
		for(Integer el:arr){
			ans[i]=el;
			i++;
		}
		return ans;
	}
	
	public void solve(TreeNode A,ArrayList arr){
		if(A==null){
			return;
		}
		solve(A.left,arr);
		arr.add(A.val);
		solve(A.right,arr);
	}
}