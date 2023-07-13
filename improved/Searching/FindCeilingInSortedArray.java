/*
Problem Description
Given a sorted array B of integers of size A, and a integer value C, return the ceiling of C which is present in array B.


Problem Constraints
1 <= A <= 105,
-109 <= B[i] <= 109,
-109 <= C <= 109


Input Format
The first argument A is the size of the array.
The second argument B is the sorted array.
The third argument C is the integer value whose ceil in the array is to be obtained.


Output Format
A single integer, denoting the ceil of C present in array B. If no ceil is present return -1.


Example Input
Input 1:

A = 5
B = [2, 5, 6, 9, 18]
C = 7
Input 2:

A = 6
B = [3, 7, 9, 11, 19, 20]
C = 22


Example Output
Output 1:
9
Output 2:

-1
*/


public class Solution{
	
		public int solve(int A,ArrayList<Integer>B,int C){
				int low = 0;
				int high= A-1;
				int ans = -1;
				while(low<=high){
					int mid = (low+high)/2;
					if(B.get(mid)<C){
						low=mid+1;
					}else{
						ans=B[mid];
						high=mid-1;
					}
				}
				return ans;
		}
}