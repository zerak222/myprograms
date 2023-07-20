/*
Problem Description
Given N jobs where every job is represented by following three elements of it.
Start Time
Finish Time
Profit Associated
Find and return the maximum profit subset of jobs such that no two jobs in the subset overlap.


Problem Constraints
1 <= N <= 105
1 <= A[i][0], A[i][1], A[i][2] <= 105


Input Format
The first and the only line of input contains a 2d array, A, of N x 3 integers:
A[i][0] : Start Time
A[i][1] : Finish Time
A[i][2] : Profit


Output Format
Return the maximum possible profit under the given conditions.


Example Input
Input 1:
A = [ [1, 2, 50],
      [3, 5, 20],
      [6, 19, 100],
      [2, 100, 200] ]
Input 2:
A = [ [10, 20, 50],
      [20, 30, 20],
      [30, 40, 100] ]


Example Output
Output 1:
250
Output 2:
170
*/

public class Solution{
	class Pair{
		int start;
		int end;
		int profit;
		Pair(int start,int end,int profit){
			this.start = start;
			this.end = end;
			this.profit = profit;
		}
	}
	public int solve(int A[][]){
		int n = A.length;
		// prepare the Pair Array
		Pair arr[] = new Pair[n];
		for(int i=0;i<n;i++){
			arr[i]=new Pair(A[i][0],A[i][2],A[i][2]);
		}
		// sort the array based on end time 
		Arrays.sort(arr, new Comparator<Pair>(){
			public int compare(Pair A,Pair B){
				if(A.end == B.end){
					return A.start-B.start;
				}
				return A.end-B.end;
			}
		});
		
		int dp[] = new int[n];
		dp[0]=arr[0].profit;
		for(int i=1;i<n;i++){
			int tempMax = arr[i].profit;
			int j = searchMaxIndex(arr,i);
			if(j!=-1){
				tempMax = tempMax+dp[j]; // add the prev max value to the tempMax to record the sum till now 
			}
			dp[i]=Math.max(tempMax,dp[i-1]); // select the max value between the previous profit and tempMax profit 
		}
		return dp[n-1];
	}
	public int searchMaxIndex(Pair p[],int i){
		int start = 0;
		int end = i-1;
		int result = -1;
		
		int givenStart = p[i].start;
		while(start<=end){
			int mid = (start+end)/2;
			if(p[mid].end<=givenStart){ // not coinciding 
				result = mid;
				start = mid+1;
			}else{
				end = mid-1; // coinciding then don't update the result 
			}
		}
		
		return result;
	}
}