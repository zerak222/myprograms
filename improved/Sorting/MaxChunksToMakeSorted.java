/*
	Description:
	
	Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)], if we split the array into some number of "chunks" (partitions), and individually sort each chunk. After concatenating them in order of splitting, the result equals the sorted array.

	What is the most number of chunks we could have made?
	
	Example :
	1) Input : A=[1,2,3,4,0]
	   Output : 1
	   
	   Take whole array as one chunk, all the elements are sorted 
	   
	
	2) Input : A=[2,0,1,3]
	   Output : 2
	   
	   Take two chunks [2,0,1] [3]
	   After sorting [0,1,2] [3]
	   Concatenate them [0,1,2,3]
	   
	   
	 Idea : 
	 -> while looping identify the index where we get max elements till that index equals the index.
	 -> At that index increase the count.
	 -> return the total count.
	
	
*/


public class Solution {    
    public int solve(int[] A) {       
        int count=0;
        int max=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,A[i]);
            if(max==i){
                count++;
            }
        }
        return count;
    }
}
