/*

Problem Description
Given a matrix of integers A of size N x M consisting of 0, 1 or 2.

Each cell can have three values:

The value 0 representing an empty cell.

The value 1 representing a fresh orange.

The value 2 representing a rotten orange.

Every minute, any fresh orange that is adjacent (Left, Right, Top, or Bottom) to a rotten orange becomes rotten. Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1 instead.

Note: Your solution will run on multiple test cases. If you are using global variables, make sure to clear them.



Problem Constraints
1 <= N, M <= 1000

0 <= A[i][j] <= 2



Input Format
The first argument given is the integer matrix A.



Output Format
Return the minimum number of minutes that must elapse until no cell has a fresh orange.

If this is impossible, return -1 instead.



Example Input
Input 1:

A = [   [2, 1, 1]
        [1, 1, 0]
        [0, 1, 1]   ]
Input 2:

 
A = [   [2, 1, 1]
        [0, 1, 1]
        [1, 0, 1]   ]


Example Output
Output 1:

 4
Output 2:

 -1

*/

public class Solution {
    class Pair{
        int i;
        int j;
        int t;
        Pair(int aI,int aJ,int aT){
            this.i = aI;
            this.j = aJ;
            this.t = aT;
        }
    }
    int row[] = {-1,0,1,0};
    int col[] = {0,-1,0,1};
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size(); // rows
        int m = A.get(0).size(); // columns

        int totalOrangesCount =0;
        Queue<Pair> qu = new ArrayDeque();
        // fill the queue with the rotten oranges in the begining t=0, also count the total number of oranges
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A.get(i).get(j)==1 || A.get(i).get(j)==2){
                    totalOrangesCount++;
                }
                if(A.get(i).get(j)==2){
                    qu.add(new Pair(i,j,0));
                }
            }
        }
        int time =0;
        int rottenCount=0;
        while(!qu.isEmpty()){
            // remove 
            Pair rem = qu.remove();
            // print or increase the count
            rottenCount++;
            time = rem.t;

            for(int d=0;d<4;d++){
                    int r = rem.i+row[d];
                    int c = rem.j+col[d];

                    if(r>=0 && c>=0 && r<n && c<m && A.get(r).get(c)==1){
                        qu.add(new Pair(r,c,rem.t+1));
                        A.get(r).set(c,2);
                    }                
            }            
        }       
        if(rottenCount!=totalOrangesCount){
            return -1;
        }
        return time;
        

    }
}
