/*
	Given a sorted array , check if there exists a pair(i,j) such that A[j]-A[i]==k , k>0 and i!=j
*/

public boolean pairDifference(int A[],int k){
		int i=0;
		int j=1;
		while(j<A.length){
			int diff = A[j]-A[i];
			if(diff==k){
			    return true;
			}else if(diff<k){
				j++; // to increase the diff	
			}else{
				i++; // to decrease the diff
			}
		}
		return false;
}