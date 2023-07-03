/*
Given a binary tree, return the Postorder traversal of its nodes values.

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

 [3, 2, 1]
Output 2:

 [6, 3, 2, 1]
*/

public class Solution{
	public int[] postOrderTraversal(TreeNode A){
		ArrayList<Integer>li = new ArrayList();
		solve(A,li);
		int ans[] = new int[li.size()];
		int i=0;
		for(Integer el:li){
			li.add(el);
			i++;
		}
		return ans;
	}
	public void solve(TreeNode A,ArrayList li){
		if(A==null){
			return;
		}
		solve(A.left,li);
		solve(A.right,li);
		li.add(A.val);
	}
}