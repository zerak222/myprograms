/*
	Given a sorted array , check if there exists a pair (i,j) such that A[i]+A[j]==k and i!=j
	
	Example : 
	I/p : A={3,7,8,12,19} , k= 19 => ans = true
	I/p : A={2,5,8,9,10} , k=9 => ans = false
*/

public boolean solve(int A[],int k){
		int i=0;
		int j= A.length-1;
		while(i<j){
			int sum = A[i]+A[j];
			if(sum==k){
				return true;
			}else if(sum<k){
				i++;
			}else{
				j--;
			}
		}
		return false;
}