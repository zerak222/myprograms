import java.util.*;

/*
    Given an array, find if there is a pair such that A[i]+A[j]=k and i!=j;
*/

class Main {
	
	public static void main(String args[]) {
        int A[] = {8,9,1,-2,4,5,11,-6,4};
        System.out.println(solve(A,8));
	}
	
	public static boolean solve(int A[], int k) {
        int n= A.length;
        HashSet<Integer>set = new HashSet();
        for(int i=0;i<n;i++){
            if(set.contains(k-A[i])){
                return true;
            }
            set.add(A[i]);
        }
        return false;
        
    }
}