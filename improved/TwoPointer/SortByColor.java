/*
	Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will represent the colors as,

red -> 0
white -> 1
blue -> 2

Note: Using the library sort function is not allowed.


Input 1: 
  A = [0, 1, 2, 0, 1, 2]
Output 1:
    [0, 0, 1, 1, 2, 2]
	
Input 2:
  A = [0]
Output 2:
	[0]

*/

public class Solution {
    public int[] sortColors(int[] A) {
        int n = A.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while( mid<=high){
            if(A[mid]==2){
                //swap mid with high
                int k = A[mid];
                A[mid]=A[high];
                A[high]=k;
                high--;
                
            }else if(A[mid]==0){
                int k= A[mid];
                A[mid]=A[low];
                A[low]= k;
                mid++;
                low++;
            }else{
                // i.e A[mid]=1
                mid++;

            }
        }
        return A;
    }
}
