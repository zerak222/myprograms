/*
	Minimum Sum Path:
	
	Problem Description
Given a M x N grid A of integers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Return the minimum sum of the path.

NOTE: You can only move either down or right at any point in time.



Problem Constraints
1 <= M, N <= 2000

-1000 <= A[i][j] <= 1000



Input Format
First and only argument is a 2-D grid A.



Output Format
Return an integer denoting the minimum sum of the path.



Example Input
Input 1:

 A = [
       [1, 3, 2]
       [4, 3, 1]
       [5, 6, 1]
     ]
Input 2:

 A = [
       [1, -3, 2]
       [2, 5, 10]
       [5, -5, 1]
     ]


Example Output
Output 1:

 8
Output 2:

 -1

*/

public class Solution{
	int dp[][];
	public int minSumPath(ArrayList<ArrayList<Integer>>A){
		int n = A.size();
		int m = A.get(0).size();
		dp = new int[n][m];
		// fill dp with -1
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				dp[i][j]=-1;
			}
		}
		return helper(A,n-1,m-1);
	}
	public int helper(ArrayList<ArrayList<Integer>> A,int i,int j){
		// base condition
		if(i<0||j<0){
			return Integer.MAX_VALUE;
		}
		// check if already existing
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		// check for initial position
		if(i==0 && j==0){
			return dp[i][j]=A.get(i).get(j);
		}
		int a = helper(A,i-1,j);
		int b = helper(A,i,j-1);
		return dp[i][j]=Math.min(a,b)+A.get(i).get(j);
	}
}