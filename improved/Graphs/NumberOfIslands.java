/*
Given a matrix of integers A of size N x M consisting of 0 and 1. A group of connected 1's forms an island. From a cell (i, j) such that A[i][j] = 1 you can visit any cell that shares a corner with (i, j) and value in that cell is 1.

More formally, from any cell (i, j) if A[i][j] = 1 you can visit:

(i-1, j) if (i-1, j) is inside the matrix and A[i-1][j] = 1.
(i, j-1) if (i, j-1) is inside the matrix and A[i][j-1] = 1.
(i+1, j) if (i+1, j) is inside the matrix and A[i+1][j] = 1.
(i, j+1) if (i, j+1) is inside the matrix and A[i][j+1] = 1.
(i-1, j-1) if (i-1, j-1) is inside the matrix and A[i-1][j-1] = 1.
(i+1, j+1) if (i+1, j+1) is inside the matrix and A[i+1][j+1] = 1.
(i-1, j+1) if (i-1, j+1) is inside the matrix and A[i-1][j+1] = 1.
(i+1, j-1) if (i+1, j-1) is inside the matrix and A[i+1][j-1] = 1.
Return the number of islands.

NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.



Problem Constraints
1 <= N, M <= 100

0 <= A[i] <= 1



Input Format
The only argument given is the integer matrix A.



Output Format
Return the number of islands.



Example Input
Input 1:

 A = [ 
       [0, 1, 0]
       [0, 0, 1]
       [1, 0, 0]
     ]
Input 2:

 A = [   
       [1, 1, 0, 0, 0]
       [0, 1, 0, 0, 0]
       [1, 0, 0, 1, 1]
       [0, 0, 0, 0, 0]
       [1, 0, 1, 0, 1]    
     ]


Example Output
Output 1:

 2
Output 2:

 5


*/

public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<A.get(i).size();j++){
                if(A.get(i).get(j)==1){
                    A.get(i).set(j,-1);
                    ans++;
                    dfsIslandsComps(A,i,j);
                }
            }
        }
        return ans;

    }
    int rows[] = {-1,0,1,0,-1,1,-1,1};
    int cols[] = {0,-1,0,1,-1,1,1,-1};
    public void dfsIslandsComps(ArrayList<ArrayList<Integer>>A,int i,int j){
        int n = A.size();
        int m = A.get(0).size();
        for(int d=0;d<8;d++){
            int r = i + rows[d];
            int c = j + cols[d];
            if(r>=0 && c>=0 && r<n && c<m && A.get(r).get(c)==1){
                // mark
                A.get(r).set(c,-1);
                dfsIslandsComps(A,r,c);
            }
        }
    }
}
