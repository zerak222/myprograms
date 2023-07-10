/*
Given preorder and inorder traversal of a tree, construct the binary tree.

NOTE: You may assume that duplicates do not exist in the tree.

Example Input : 
Input 1:

 A = [1, 2, 3]
 B = [2, 1, 3]
Input 2:

 A = [1, 6, 2, 3]
 B = [6, 1, 3, 2]


Example Output
Output 1:

   1
  / \
 2   3
Output 2:

   1  
  / \
 6   2
    /
   3
*/

public class Solution {
	
	public TreeNode buildTree(int A[], int B[]){
		return makeTree(A,0,A.length-1,B,0,B.length-1);
	}
	
	public TreeNode makeTree(int pre[],int aPStart,int aPEnd,int In[],int aInStart,int aInEnd){
			if(aPStart>aPEnd || aInStart>aInEnd){
				return null;
			}
			// create a root node using first element of pre 
			TreeNode node = new TreeNode(pre[aPStart]);
			// find the index of root node in In array
			int idx = 0;
			for(int i=aInStart;i<=aInEnd;i++){
				if(In[i]==pre[aPStart]){
					idx = i;
					break;
				}
			}
			// number of elements in left subtree 
			int nle = idx-aInStart;
			// make call to build left subtree, use nle to find the left node end in pre 
			node.left = makeTree(pre,aPStart+1,aPStart+nle,In,aInStart,idx-1);
			// make call to build right subtree
			node.right = makeTree(pre,aPStart+nle+1,aPEnd,In,idx+1,aInEnd);
			return node;
	}
	
}