public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int low = 0;
        int high = A.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(A[mid]==B){
                return mid;
            }
            else if(A[low]<A[mid]){
                // low to mid is sorted
                if(A[low]<=B && B<=A[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                // mid+1 to high is sorted
                if(A[mid+1]<=B && B<=A[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
