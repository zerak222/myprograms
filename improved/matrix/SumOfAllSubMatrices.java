public class Solution {
    public int solve(int[][] A) {
        int n=A.length;
        int m=A[0].length;
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int freq = (i+1)*(j+1)*(n-i)*(m-j); // frequency of the occurrance of the element A[i][j]
                ans = ans+A[i][j]*freq;
            }
        }
        return ans;
    }
}
