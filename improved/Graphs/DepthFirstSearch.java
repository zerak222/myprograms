/*
	You are given N towns (1 to N). All towns are connected via unique directed path as mentioned in the input.

Given 2 towns find whether you can reach the first town from the second without repeating any edge.

B C : query to find whether B is reachable from C.

Input contains an integer array A of size N and 2 integers B and C ( 1 <= B, C <= N ).

There exist a directed edge from A[i] to i+1 for every 1 <= i < N. Also, it's guaranteed that A[i] <= i for every 1 <= i < N.

NOTE: Array A is 0-indexed. A[0] = 1 which you can ignore as it doesn't represent any edge.



Problem Constraints
1 <= N <= 100000



Input Format
First argument is vector A

Second argument is integer B

Third argument is integer C



Output Format
Return 1 if reachable, 0 otherwise.



Example Input
Input 1:

 A = [1, 1, 2]
 B = 1
 C = 2
Input 2:

 A = [1, 1, 2]
 B = 2
 C = 1


Example Output
Output 1:

 0
Output 2:

 1

*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(ArrayList<Integer> A, final int B, final int C) {
        // prepare graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList();
        int N = A.size();
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<N;i++){
            graph.get(A.get(i)).add(i+1);
        }
        boolean visited[] = new boolean[N+1];
        return dfs(C,B,visited,graph)?1:0;
    }
    public boolean dfs(int s,int d,boolean vis[],ArrayList<ArrayList<Integer>> graph){
        if(s==d){
            // reached the destination
            return true;
        }
        vis[s]=true;
        for(int nbr:graph.get(s)){
            // check for each neighbour ->d
            if(!vis[nbr] && dfs(nbr,d,vis,graph) ){
                return true;
            }
        }
        return false;
    }
    
}
