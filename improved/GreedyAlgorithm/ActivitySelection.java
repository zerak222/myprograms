/*
Given two integer arrays A and B of size N.

There are N activities where A[i] denotes the start time of the ith activity and B[i] denotes the finish time of the ith activity.

Your task is to select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.


Input Format

The first argument given is the integer array A.
The second argument given is the integer array B.
Output Format

Return the maximum number of activities that can be performed by a single person.
Constraints

1 <= N <= 100000
0 <= A[i] <= B[i] <= 2*10^9 
For Example

Input 1:
    A = [5, 1, 3, 0, 5, 8]
    B = [9, 2, 4, 6, 7, 9]
Output 1:
    4
    Explanation 1:
        Activites 2, 3, 5 and 6 can be selected (1- based indexing).

Input 2:
    A = [17, 8, 14, 24, 10, 8, 1, 30]
    B = [18, 45, 24, 27, 18, 10, 38, 35]
Output 2:
    4
*/

public class Solution{
	class Pair{
		int start ;
		int end ; 
		Pair(int aStart, int aEnd){
			this.start = aStart;
			this.end = aEnd;
		}
	}
	public int solve(int[] A, int[] B) {
		int n = A.length;
		// 1. create array of Pair
		Pair arr[] = new Pair[n];
		for(int i=0;i<n;i++){
			arr[i]= new Pair(A[i],B[i]);
		}
		// 2. sort the arrays based on the earliest end time
		Arrays.sort(arr, new Comparator<Pair>(){
			public int compare(Pair A,Pair B){
				return A.end - B.end;
			}
		});
		// 3. Making answer
		int ans = 1;
		int latestEnd = arr[0].end;
		for(int i=1;i<n;i++){
			Pair p =  arr[i];
			if(p.start >=latestEnd){  // if not coinciding increase the count
				ans++;
				latestEnd = p.end;
			}	
		}
		return ans;
	}
}