/*
Given a 2 x N grid of integers, A, your task is to choose numbers from the grid such that sum of these numbers is maximized. 
However, you cannot choose two numbers that are adjacent horizontally, vertically, or diagonally. 

Return the maximum possible sum.

Note: You are allowed to choose more than 2 numbers from the grid.

Problem Constraints
1 <= N <= 20000
1 <= A[i] <= 2000


Input Format
The first and the only argument of input contains a 2d matrix, A.


Output Format
Return an integer, representing the maximum possible sum.


Example Input
Input 1:

 A = [   
        [1]
        [2]    
     ]
Input 2:

 A = [   
        [1, 2, 3, 4]
        [2, 3, 4, 5]    
     ]


Example Output
Output 1:

 2
Output 2:

 8
 
*/

public class Solution{
	int dp[];
	public int adjacent(ArrayList<ArrayList<Integer>> A){
		// prepare max col 1D array/arraylist
		int n = A.get(0).size();
		ArrayList<Integer> li = new ArrayList();
		for(int i=0;i<n;i++){
			int r1 = A.get(0).get(i);
			int r2 = A.get(1).get(i);
			li.add(Math.max(r1,r2));
		}
		dp = new int[n];
		Arrays.fill(dp,-1);
		return maxSum(li,n-1); // start from last element
	}
	public int maxSum(ArrayList<Integer>A,int i){
		if(i<0){
			return 0;
		}
		if(dp[i]!=-1){
			return dp[i];
		}
		int a = maxSum(A,i-2); // consider
		int b = maxSum(A,i-1); // not consider 
		int ans = Math.max(a+A[i],b);
		dp[i]=ans;
		return ans;
	}
}