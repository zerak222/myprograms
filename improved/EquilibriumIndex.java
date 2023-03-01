public class Solution {
    public int solve(int[] A) {
        int n= A.length;
        int ps[] = new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum+A[i];
            ps[i]=sum;
        }

        for(int i=0;i<n;i++){
            int rs = ps[n-1]-ps[i];
            int ls = (i==0)?0:ps[i-1];
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}