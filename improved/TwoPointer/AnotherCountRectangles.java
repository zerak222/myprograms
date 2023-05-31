public class Solution {
    public int mod = 1000000007;
    public int solve(int[] A, int B) {
        int n = A.length;
        long count = 0;
        int l=0,r=n-1;
        while(l<n && r>=0){
            long area = (long) A[l]*A[r];
            if(area<B){
                // count elements less than r
                count += (r+1)%mod;                
                l++;
            }else {
                r--;
            }
        }
        return (int)(count % mod);
    }
}
