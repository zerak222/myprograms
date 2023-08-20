/*
Given two integer arrays A and B of size N each which represent values and weights associated with N items respectively.

Also given an integer C which represents knapsack capacity.

Find out the maximum value subset of A such that sum of the weights of this subset is smaller than or equal to C.

NOTE:

You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).

Problem Constraints
1 <= N <= 103

1 <= C <= 103

1 <= A[i], B[i] <= 103



Input Format
First argument is an integer array A of size N denoting the values on N items.

Second argument is an integer array B of size N denoting the weights on N items.

Third argument is an integer C denoting the knapsack capacity.



Output Format
Return a single integer denoting the maximum value subset of A such that sum of the weights of this subset is smaller than or equal to C.



Example Input
Input 1:

 A = [60, 100, 120]
 B = [10, 20, 30]
 C = 50
Input 2:

 A = [10, 20, 30, 40]
 B = [12, 13, 15, 19]
 C = 10


Example Output
Output 1:

 220
Output 2:

 0
*/

public class Solution{
	int dp[][];
	public int solve(int A[],int B[],int C){
		int n = A.length;
		dp = new int[n][C+1];
		// fill -1
		for(int i=0;i<n;i++){
			for(int j=0;j<=C+1;j++){
				dp[i][j]=-1;
			}
		}
		return helper(A,B,n-1,C);
	}
	public int helper(int A[],int B[],int i,int k){
		if(i<0 || k==0){
			return 0;
		}
		if(dp[i][k]!=-1){
			return dp[i][k];
		}
		int a=0;
		if(k-B[i]>=0){
			a=helper(A,B,i-1,k-B[i])+A[i];
		}
		int b=helper(A,B,i-1,k);
		int ans = Math.max(a,b);
		dp[i][k]=ans;
		return ans;
	}
	
}