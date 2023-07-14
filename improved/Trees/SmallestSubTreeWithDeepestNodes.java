/*

Problem Description

Given a binary tree with root node pointer A . The depth of each node is the shortest distance to the root. A node is deepest if it has the largest depth possible among any node in the entire tree.
The subtree of a node is that node, plus the set of all descendants of that node.

Return the node with the largest depth such that it contains all the deepest nodes of the entire tree lies in its subtree.

NOTE: All nodes values are uniques in the tree.



Problem Constraints

1 <= Total number of nodes <= 100000
0 <= Nodes values <= 10



Input Format

The only arguments given are root pointer A.



Output Format

Return the node with the largest depth such that it contains all the deepest nodes of the entire tree lies in its subtree.



Example Input

       1
      / \
     2   3
    / \  \
   6   4  5
      / \
     12  13 


Example Output

      4
     / \
    12  13
*/

public class Solution{
	
	public TreeNode solve(TreeNode A){
		if(A==null){
			return null;
		}
		int lh = getHeight(A.left);
		int rh = getHeight(A.right;
		if(lh==rh){
			return A;
		}else{
			if(lh>rh){
				return solve(A.left);
			}else{
				return solve(A.right);
			}
		}
	}

	public int getHeight(TreeNode A){
		if(A==null){
			return 0;
		}
		int lh = getHeight(A.left);
		int rh = getHeight(A.right;
		return 1+lh+rh;
	}
}