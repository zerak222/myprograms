import java.util.*;

class Main {
	/*
	Subarray with given sum
    
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
If the answer does not exist return an array with a single element "-1".
First sub-array means the sub-array for which starting index in minimum.
	
	
	Ex:1
		I/p : 
			 A = [1, 2, 3, 4, 5]
             B = 5
	 	O/p : 
		 	 [2, 3]
    Ex:2
         I/p :
            A = [5, 10, 20, 100, 105]
            B = 110
         O/p : 
              -1
	 
	*/
	public static void main(String args[]) {
		int []A = {1, 2, 3, 4, 5 };
        int B=5;
		System.out.println(Arrays.toString(solve(A,B)));
		
	}
	
	public static int[] solve(int[] A, int B) {
        int n=A.length;
        HashMap<Integer,Integer>map = new HashMap();
        int sum=0;
        int first=0;
        int last=0;
        boolean hasSubArray = false;
        for(int i=0;i<n;i++){
            sum+=A[i];
            if((sum-B)==0){
                last = i; // when sum == B, for this case
                break;
            }
            if(map.containsKey(sum-B)){
                first=map.get(sum-B)+1;
                last=i; 
                hasSubArray = true;
                break;               
            }
            map.put(sum,i);            
        }
        if(hasSubArray){
            int length = last-first+1;
            int ans[] = new int[length];
            int j=0;
            for(int i=first;i<=last;i++){
                ans[j]=A[i]; 
                j++;
            }
            return ans;
        }
        int ans[] = {-1};
        return ans;
        
    }
}