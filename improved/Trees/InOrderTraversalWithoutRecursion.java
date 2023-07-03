/*
Problem Description
Given a binary tree, return the inorder traversal of its nodes' values.

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
   
   
Example Output
Output 1:

 [1, 3, 2]
Output 2:

 [6, 1, 3, 2]
 
*/

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
 */
public class Solution {
    public class Pair{
        TreeNode node;
        int state;
        Pair(TreeNode aNode,int aState){
            this.node = aNode;
            this.state = aState;
        }
    }
    public int[] inorderTraversal(TreeNode A) {
        Stack<Pair>st = new Stack();
        st.push(new Pair(A,0));
        ArrayList<Integer> li = new ArrayList();
        while(st.size()>0){
            Pair top = st.peek();
            if(top.state ==0){
                // In PRE area
                // increment in state and add left child
                top.state++;
                if(top.node.left!=null){
                    st.push(new Pair(top.node.left,0));
                }

            }else if(top.state == 1){
                // In IN area
                // update ans with val , increment state and add right child 
                li.add(top.node.val);
                top.state++;
                if(top.node.right!=null){
                    st.push(new Pair(top.node.right,0));
                }
            }else{
                // POST area
                st.pop();
            }
        }
        int ans[] = new int[li.size()];
        int i=0;
        for(Integer el:li){
            ans[i]=el;
            i++;
        }
        return ans;
    }
}
