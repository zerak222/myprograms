public class Solution {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int ans[]= new int[B.length];
        int prefixSum[][] = prefixSum(A);
        int mod = 1000000007;
        for(int i=0;i<B.length;i++){
            int x1=B[i]-1;
            int y1=C[i]-1;
            int x2=D[i]-1;
            int y2=E[i]-1;
            int sum=0;
            sum+=prefixSum[x2][y2];
            if(x1>0){
                sum=(sum-prefixSum[x1-1][y2])%mod; // % mod to reduce the ps sum for every element
            }
            if(y1>0){
                sum=(sum-prefixSum[x2][y1-1])%mod; // % mod to reduce the ps sum for every element
            }
            if(x1>0 && y1>0){
                sum=(sum+prefixSum[x1-1][y1-1])%mod; // % mod to reduce the ps sum for every element
            }
            if(sum<0){
                sum=(sum+mod)%mod; // reverting the %mod changes to get the original sum if sum < 0
            }
            ans[i]=sum;
        }
        return ans;
    }
	// prefix sum array construction
    public int[][] prefixSum(int A[][]){
        int mod = 1000000007; // mod is used because the input can be huge and we don't want unwanted results with huge input
        int n = A.length;
        int m = A[0].length;
        int ps[][] = new int[n][m];
        // apply prefix sum row by row
        for(int i=0;i<n;i++){
            ps[i][0] = A[i][0];
            for(int j=1;j<m;j++){
                ps[i][j] = (ps[i][j-1] + A[i][j])%mod;  // % mod to reduce the ps sum for every element
            }
        }
        // apply prefix sum col to col
        for(int j=0;j<m;j++){
            for(int i=1;i<n;i++){
                ps[i][j]=(ps[i-1][j] + ps[i][j])%mod; // % mod to reduce the ps sum for every element
            }
        }
        return ps;
    }
}
