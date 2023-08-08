/*
Clone Graph 

Problem Description
Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.

Note: The test cases are generated in the following format (use the following format to use See Expected Output option):
First integer N is the number of nodes.
Then, N intgers follow denoting the label (or hash) of the N nodes.
Then, N2 integers following denoting the adjacency matrix of a graph, where Adj[i][j] = 1 denotes presence of an undirected edge between the ith and jth node, O otherwise.



Problem Constraints
1 <= Number of nodes <= 105



Input Format
First and only argument is a node A denoting the root of the undirected graph.



Output Format
Return the node denoting the root of the new clone graph.



Example Input
Input 1:

      1
    / | \
   3  2  4
        / \
       5   6
Input 2:

      1
     / \
    3   4
   /   /|\
  2   5 7 6


Example Output
Output 1:

 Output will the same graph but with new pointers:
      1
    / | \
   3  2  4
        / \
       5   6
Output 2:

      1
     / \
    3   4
   /   /|\
  2   5 7 6


*/
/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution{
	Map<UndirectedGraphNode,UndirectedGraphNode> visited = new HashMap();
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode aNode){
			if(aNode==null){
					return aNode;
			}
			// check if the node is already visited 
			if(visited.containsKey(aNode)){
					return visited.get(aNode);
			}
			// node is not found in visited map, hence create a new node and add children to it
			UndirectedGraphNode root = new UndirectedGraphNode(aNode.label);
			visited.put(aNode,root);
			root.neighbours = new ArrayList();
			for(UndirectedGraphNode nbr:aNode.neighbours){
					root.neighbours.add(cloneGraph(nbr));
			}
			return root;
	}
}