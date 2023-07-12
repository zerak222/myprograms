/*
Problem Description
Two elements of a Binary Search Tree (BST), represented by root A are swapped by mistake. Tell us the 2 values, when swapped, will restore the Binary Search Tree (BST).
A solution using O(n) space is pretty straightforward. Could you devise a constant space solution?
Note: The 2 values must be returned in ascending order


Problem Constraints
1 <= size of tree <= 100000

Input Format
First and only argument is the head of the tree,A

Output Format
Return the 2 elements which need to be swapped.

Example Input
Input 1:

         1 
        / \ 
       2   3
Input 2:

 
         2
        / \
       3   1


Example Output
Output 1:

 [2, 1]
Output 2:

 [3, 1]


*/
public class Solution{
	
	int first = Integer.MIN_VALUE;
	int last = Integer.MIN_VALUE;
	int middle = Integer.MIN_VALUE;
	int prev = Integer.MIN_VALUE;
	public int[] recoverTree(TreeNode A){
		solve(A);
		int ans[] = new int[2];
		ans[0]=first;
		ans[1]=(last!=Integer.MIN_VALUE)?last:middle;
		// sort ans 
		if(ans[0]>ans[1]){
			// swap them 
			int temp = ans[0];
			ans[0]=ans[1];
			ans[1]=temp;
		}
		return ans;
	}
	public void solve(TreeNode A){
		if(A==null){
			return;
		}
		solve(A.left);
		if(prev > A.val){
			if(first==Integer.MIN_VALUE){
				// for first element with discrepency
				first = prev;
				middle = A.val;
			}else{
				last = A.val;
			}
		}
		prev = A.val;// carrying to next node iteration
		solve(A.right);
	}
}