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
 
 
 Problem Description
Given a binary tree of integers. Return an array of integers representing the left view of the Binary tree.

Left view of a Binary Tree is a set of nodes visible when the tree is visited from Left side

NOTE: The value comes first in the array which have lower level.

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

 [1, 2, 4, 8]
Output 2:

 [1, 2, 4, 5]
 */
public class Solution {
    public int[] solve(TreeNode A) {
        ArrayList<Integer> ansLi = leftView(A);
        int ans[] = new int[ansLi.size()];
        for(int i=0;i<ansLi.size();i++){
            ans[i]=ansLi.get(i);
        }
        return ans;
    }
    public ArrayList<Integer> leftView(TreeNode A){
        ArrayList<Integer> li = new ArrayList();
        Queue<TreeNode>qu = new LinkedList();
        qu.add(A);
        while(qu.size()>0){
            int sz = qu.size();
            li.add(qu.peek().val);
            for(int i=0;i<sz;i++){
                TreeNode node = qu.remove();
                // add left children
                if(node.left!=null) {
                    qu.add(node.left);
                }
                if(node.right!=null){
                    qu.add(node.right);
                }
            }
        }
        return li;
    }
}
