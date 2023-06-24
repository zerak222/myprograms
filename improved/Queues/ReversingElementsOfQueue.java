/*
	Given an array of integers A and an integer B, we need to reverse the order of the first B elements of the array, 
leaving the other elements in the same relative order. 

NOTE: You are required to the first insert elements into an auxiliary queue then perform Reversal of first B elements.


Input 1:

 A = [1, 2, 3, 4, 5]
 B = 3
 
Output 1:
 [3, 2, 1, 4, 5]
 
Input 2:

 A = [5, 17, 100, 11]
 B = 2

Output 2:
 [17, 5, 100, 11]

*/

public class Solution{
	    // using Queue
		public int[] solve(int A[],int B){
			Queue<Integer>qu = new LinkedList();
			for(int i=B-1;i>=0;i--){
				qu.add(A[i]);
			}
			for(int i=0;i<B;i++){
				A[i]=qu.remove();
			}
			return A;
		}
		// using Stack
		public int[] solve(int A[],int B){
			Stack<Integer>st = new Stack();
			for(int i=0;i<B;i++){
				st.add(A[i]);
			}
			for(int i=0;i<B;i++){
				A[i]=st.pop();
			}
			return A;
		}
}