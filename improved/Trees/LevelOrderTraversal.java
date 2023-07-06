/*
	Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3
 
Output 1: 
 [
   [3],
   [9, 20],
   [15, 7]
 ]
Output 2:

 [ 
   [1]
   [6, 2]
   [3]
 ]
*/

public class Solution{
	public int[][] solve(TreeNode A){
		ArrayList<ArrayList<Integer>> li = levelOrder(A);
		
		// copy the arrayList to array and return
		int ans[][] = new int[li.size()][];
		for(int i=0;i<li.size();i++){
			ArrayList<Integer>levelLi = li.get(i);
			ans[i]=new int[levelLi.size()];
			for(int j=0;j<levelLi.size();j++){
				ans[i][j]=levelLi.get(j);
			}
		}
		return ans;
	}
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A){
		ArrayList<ArrayList<Integer>> ansLi = new ArrayList();
		Queue<TreeNode> qu = new LinkedList();
		qu.add(A);
		while(qu.size()>0){
			ArrayList<Integer> li = new ArrayList();
            int size = qu.size();
            for(int i=0;i<size;i++){
				// remove
				TreeNode node = qu.remove();
				// add to ans
				li.add(node.val);
				// add left 
				if(node.left!=null){
					qu.add(node.left);
				}
				// add right
				if(node.right!=null){
					qu.add(node.right);
				}
            }
            ansLi.add(li);			
		}
		return ansLi;
	}
}

