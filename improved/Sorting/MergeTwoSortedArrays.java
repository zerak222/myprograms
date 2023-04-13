public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {
        int n = A.length;
        int m = B.length;
        int ans[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(A[i]<B[j]){
                ans[k]=A[i];
                i++;
                k++;
            }else{
                ans[k]=B[j];
                j++;
                k++;
            }
            
        }
        while(i<n){
            ans[k]=A[i];
            i++;
            k++;
        }
        while(j<m){
             ans[k]=B[j];
             j++;
             k++;
        }
        return ans;
    }
}
