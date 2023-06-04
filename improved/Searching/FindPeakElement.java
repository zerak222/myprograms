/*
	Given an array of integers A, find and return the peak element in it.
An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.

NOTE:

->It is guaranteed that the array contains only a single peak element.
->Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.


Problem Constraints

1 <= |A| <= 100000

1 <= A[i] <= 10^9


Input 1:
A = [1, 2, 3, 4, 5]

Input 2:
A = [5, 17, 100, 11]


Output 1:
 5
 
Output 2:
 100

*/

public class Solution{
		public int solve(int A[]){
			int n=A.length;
			if(n==1){
				return A[0];
			}
			// since there is only one peak element, check corner elements directly
			if(A[0]>A[1]){
				return A[0];
			}else if(A[n-1]>A[n-2]){
				return A[n-1];
			}
			// if the above conditions does not met
			int low =1;
			int high=n-1;
			while(low<=high){
				int mid = (low+high)/2;
				if(A[mid]>=A[mid-1] && A[mid]>=A[mid+1]){ // A[mid} is the peak element
					return A[mid];
				}else{ // A[mid} is not the peak element
					if(A[mid]<A[mid-1]){   
						// left neighbour is greater than mid => the peak element can exist on right as we have greater element already on left
						low = mid+1;
					}else if(A[mid]<A[mid+1]){
						//  right neighbour is greater than mid => the peak element can exist on left as we already have greater element on right side
						high = mid-1;
					}
				}
			}
			return -1; // just to satisfy the compiler
		}
}