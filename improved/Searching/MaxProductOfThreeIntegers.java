public class Solution{
	public int solve(int A[]){
		Arrays.sort(A);
		int n = A.length;
		int prod1 = A[n-1]*A[n-2]*A[n-3];
		int prod2 = A[n-1]*A[0]*A[1]; // if A[0],A[1] are big negative numbers
		
		return Math.max(prod1,prod2);
	}
}