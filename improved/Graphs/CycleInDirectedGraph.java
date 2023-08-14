/*
Given an directed graph having A nodes. A matrix B of size M x 2 is given which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].

Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.

NOTE:

The cycle must contain atleast two nodes.
There are no self-loops in the graph.
There are no multiple edges between two nodes.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.

Problem Constraints
2 <= A <= 105

1 <= M <= min(200000,A*(A-1))

1 <= B[i][0], B[i][1] <= A



Input Format
The first argument given is an integer A representing the number of nodes in the graph.

The second argument given a matrix B of size M x 2 which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].



Output Format
Return 1 if cycle is present else return 0.



Example Input
Input 1:

 A = 5
 B = [  [1, 2] 
        [4, 1] 
        [2, 4] 
        [3, 4] 
        [5, 2] 
        [1, 3] ]
Input 2:

 A = 5
 B = [  [1, 2]
        [2, 3] 
        [3, 4] 
        [4, 5] ]
		
Example Output
Output 1:

 1
Output 2:

 0
*/

public class Solution{
	
	public int solve(int A,ArrayList<ArrayList<Integer>> B){
		ArrayList<ArrayList<Integer>> graph = prepareAdjacencyList(A,B);
		// prepare indegree array
		int vtx = graph.size();
		int indegree[] = new int[vtx];
		for(int i=0;i<vtx;i++){
			for(int nbr:graph.get(i)){
				indegree[nbr]++;
			}
		}
		// add 0 indegree elements to queue
		Queue<Integer> qu = new ArrayDeque();
		for(int i=0;i<vtx;i++){
			if(indegree[i]==0){
				qu.add(i);
			}
		}
		// process Queue
		int count =0;
		while(!qu.isEmpty()){
			int rem = qu.remove();
			count++;
			for(int nbr:graph.get(rem)){
				indegree[nbr]--;
				if(indegree[nbr] ==0){
					qu.add(nbr);
				}
			}
		}
		if(count<vtx){
			return 1; // cycle found
		}
		return 0;
	}
	public ArrayList<ArrayList<Integer>> prepareAdjacencyList(int A,ArrayList<ArrayList<Integer>>B){
		ArrayList<ArrayList<Integer>> graph = new ArrayList();
		for(int i=0;i<A+1;i++){
			graph.add(new ArrayList());
		}
		for(int i=0;i<B.size();i++){
			int u = B.get(i).get(0);
			int v = B.get(i).get(1);
			graph.get(u).add(v);
		}
		return graph;
	}
}