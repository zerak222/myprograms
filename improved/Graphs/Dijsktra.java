/*


Given a weighted undirected graph having A nodes and M weighted edges, and a source node C.

You have to find an integer array D of size A such that:

D[i]: Shortest distance from the C node to node i.
If node i is not reachable from C then -1.
Note:

There are no self-loops in the graph.
There are no multiple edges between two pairs of vertices.
The graph may or may not be connected.
Nodes are numbered from 0 to A-1.
Your solution will run on multiple test cases. If you are using global variables, make sure to clear them.


Problem Constraints
1 <= A <= 1e5

0 <= B[i][0],B[i][1] < A

0 <= B[i][2] <= 1e3

0 <= C < A



Input Format
The first argument is an integer A, representing the number of nodes in the graph.
The second argument is a matrix B of size M x 3, where each row represents an edge in the graph. The three columns of each row denote the source node B[i][0], the destination node B[i][1], and the weight of the edge B[i][2].
The third argument is an integer C, representing the source node for which the shortest distance to all other nodes needs to be found.


Output Format
Return the integer array D.



Example Input
Input 1:

A = 6
B = [   [0, 4, 9]
        [3, 4, 6] 
        [1, 2, 1] 
        [2, 5, 1] 
        [2, 4, 5] 
        [0, 3, 7] 
        [0, 1, 1] 
        [4, 5, 7] 
        [0, 5, 1] ] 
C = 4
Input 2:

A = 5
B = [   [0, 3, 4]
        [2, 3, 3] 
        [0, 1, 9] 
        [3, 4, 10] 
        [1, 3, 8]  ] 
C = 4


Example Output
Output 1:

D = [7, 6, 5, 6, 0, 6]
Output 2:

D = [14, 18, 13, 10, 0]

*/
public class Solution{
	class Pair{
		int wt;
		int vtx;
		Pair(int vtx,int wt){
			this.wt=wt;
			this.vtx=vtx;
		}
	}
	public ArrayList<ArrayList<Pair>> prepareAdjacencyList(int A,ArrayList<ArrayList<Integer>>B){
		ArrayList<ArrayList<Pair>> graph = new ArrayList();
		for(int i=0;i<A;i++){
			graph.add(new ArrayList());
		}
		int vtx = B.size();
		for(int i=0;i<vtx;i++){
			ArrayList<Integer> edge = B.get(i);
			int u = edge.get(0);
			int v = edge.get(1);
			int wt= edge.get(2);
			graph.get(u).add(new Pair(v,wt));
			graph.get(v).add(new Pair(u,wt));
		}
		return graph;
	}
	public ArrayList<Integer> solve(int A,ArrayList<ArrayList<Integer>>B,int C){
		ArrayList<Integer> ans = new ArrayList();
		ArrayList<ArrayList<Pair>> graph = prepareAdjacencyList(A,B);
		int vtx = graph.size();
		for(int i=0;i<vtx;i++){
			ans.add(-1);
		}
		PriorityQueue<Pair> mq = new PriorityQueue(new Comparator<Pair>(){
			public int compare(Pair p1,Pair p2){
				return p1.wt-p2-wt;
			}
		});
		mq.add(new Pair(C,0));
		while(!mq.isEmpty()){
			// 1. remove 
			Pair rem = mq.remove();
			// 2. work
			if(ans.get(rem.vtx)!=-1){
				continue;
			}
			ans.set(rem.vtx,rem.wt);
			// 3. add unvisited neighbour 
			for(Pair nbr:graph.get(rem.vtx)){
				if(ans.get(nbr.vtx)==-1){
					mq.add(new Pair(nbr.vtx,rem.wt+nbr.wt));
				}
			}
		}
		return ans;
	}
}