/*
	Given an integer array A of size N. You are asked to perfom Q queries on the given array and return the final array after processing all queries.

Each query is of type ( l, r, c), for each query add c in index range l to r.

NOTE: Value of each element in the final array will fit in 32 bit signed integer.

Example : 


Input : A = [1, 2, 1, 4]
		B = [
				[2, 3, 2]
				[1, 4, 5]
				[4, 4, 1]
			]
	 
Output : [6, 9, 8, 10]
*/


public class Solution {
    public int[] solve(int[] A, int[][] B) {
        int zeroArray[]= new int[A.length];
        int n=A.length;
        for(int i=0;i<B.length;i++){
            int l=B[i][0]-1;
            int r=B[i][1]-1;
            int c=B[i][2];
            zeroArray[l]=zeroArray[l]+c;
            if((r+1)<n){
                zeroArray[r+1]=zeroArray[r+1]-c;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+zeroArray[i];
            zeroArray[i]=sum;
            A[i]=A[i]+zeroArray[i];
        }
        return A;
    }
}
