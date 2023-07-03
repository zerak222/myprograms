/*
	Given a binary tree, return the preorder traversal of its nodes values.
	
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

 [1, 2, 3]
Output 2:

 [1, 6, 2, 3]
*/

public class Solution{
	public int[] preOrderTraversal(TreeNode A){
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
		li.add(A.val);
		solve(A.left,li);
		solve(A.right,li);
	}
}