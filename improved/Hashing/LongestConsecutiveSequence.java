import java.util.*;

class Main {
	/*
	Given an unsorted integer array A of size N.
    Find the length of the longest set of consecutive elements from array A.    
	
	
	Ex:1
		I/p : 
			 A = [100, 4, 200, 1, 3, 2]
	 	O/p : 
		 	 4
    Ex:2
         I/p :
            A = [2, 1]
         O/p : 
              2
	 
	*/
	public static void main(String args[]) {
		int []A = {100, 4, 200, 1, 3, 2 };
		System.out.println(solve(A));
		
	}
	
	public static int solve(int[] A) {
        int n=A.length;
        HashSet<Integer>set = new HashSet();
        for(int i=0;i<n;i++){
            set.add(A[i]);
        }
        int ans =0;
        for(int i=0;i<n;i++){
            int innerLength=0;
            if(set.contains(A[i]-1)){
                continue; 
                // don't do anything if we have an element-- present 
                // as we will handle it for the minimum element in the consecutive element list
                // Ex: {1,2,3,4} we ignore 2,3,4 as we count it for 1
            }
            int val=A[i];
            while(set.contains(val)){
                // for every consecutive element present increase the count.    
                innerLength++;
                val++;
            }
            ans = Math.max(ans,innerLength);
            
        }
        return ans;
        
    }
}