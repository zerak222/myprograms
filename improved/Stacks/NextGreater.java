/*
	Given an array A, find the next greater element G[i] for every element A[i] in the array.
The next greater element for an element A[i] is the first greater element on the right side of A[i] in the array, A.

More formally:

G[i] for an element A[i] = an element A[j] such that 
    j is minimum possible AND 
    j > i AND
    A[j] > A[i]
Elements for which no greater element exists, consider the next greater element as -1.
*/

public class Solution{
		public int[] nextGreater(int A[]){
			int n = A.length;
			int ans[] = new int[n];
			Stack<Integer> st = new Stack();
			ans[n-1]=-1;
			st.push(ans[n-1]);
			for(int i=n-2;i>=0;i++){
					int x = A[i];
					// clear lesser elements 
					while(st.size()>0 && st.peek()<=x){
							st.pop();
					}
					if(st.size()==0){
							ans[i]=-1;
					}else{
							ans[i]=st.peek();
					}
					st.push(x);
			}
			return ans;
		}
}