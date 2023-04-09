import java.util.*;

/*
    Given an array of integers A and an integer B, find and return the minimum number of swaps
     required to bring all the numbers less than or equal to B together.
    
     A = [1, 12, 10, 3, 14, 10, 5]
     B = 8
     
     O/p: 
     2
*/

class Main {
	
	public static void main(String args[]) {
        int A[] = {5, 17, 100, 11};
        int B= 20;
        System.out.println(minSwaps(A,B));
	}
	
	public static int minSwaps(int A[], int B) {
        int n= A.length;
        int windowLength = 0;
        // calculate window length
        for(int i=0;i<n;i++){
            if(A[i]<B){
                windowLength++;
            }
        }
        // calculate no of swaps for first window
        int start=0;  
        int end = windowLength-1; 
        int swaps = 0;     
        for(int i=start;i<=end;i++){
            if(A[i]>B){
                swaps++;             // no of non-fav elements in window equals no of swaps
            }
        }       
        int ans = swaps; // initialise ans with first window swaps
        // continue counting the swaps for the next windows
        start=1;
        end=windowLength;        
        while(end<n){
            if(A[end]>B){
                swaps++;             // non-fav element at new window end , so increase swaps count
            }
            if(A[start-1]>B){
                swaps--;             // non-fav element at old window end, so it also got added into
            }                           // swaps count , so reduce it effect by reducing swaps count by 1
            ans=Math.min(swaps,ans);  // we want min number of swaps.
            start++;  // move to next window
            end++;     
        }
        return ans;
        
    }
}