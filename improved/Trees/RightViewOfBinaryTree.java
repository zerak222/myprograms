/*
	Given a binary tree of integers denoted by root A. Return an array of integers representing the right view of the Binary tree.

	Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.
	
	
Example Input
Input 1:

 
            1
          /   \
         2    3
        / \  / \
       4   5 6  7
      /
     8 
Input 2:

 
            1
           /  \
          2    3
           \
            4
             \
              5

Example Output
Output 1:

 [1, 3, 7, 8]
Output 2:

 [1, 3, 4, 5]
 
*/

public class Solution{
	public int[] solve(TreeNode A){
		ArrrayList<Integer> ansLi = rightView(A);
		int ans[] = new int[ansLi.size()];
		for(int i=0;i<ansLi.size();i++){
			ans[i]=ansLi.get(i);
		}
		return ans;
	}
	public ArrayList<Integer> rightView(TreeNode A){
		ArrayList<Integer> li = new ArrayList();
		Queue<TreeNode> qu = new LinkedList();
		qu.add(A);
		while(qu.size()>0){
			int sz = qu.size();
			int val = 0;
			for(int i=0;i<sz;i++){
				TreeNode node = qu.remove();
				val = node.val; // carry the val till the last element of the level
				if(node.left!=null){
					qu.add(node.left);
				}
				if(node.right!=null){
					qu.add(node.right);
				}
			}
			li.add(val); last element of the level is the right view 
		}
		return li;
	}
}