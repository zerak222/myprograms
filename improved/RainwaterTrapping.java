public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int pfMax[] = prefixMaxArray(A);
        int sfMax[] = suffixMaxArray(A);
        int ans = 0;
        for(int i=1;i<A.length-1;i++){   // start from 1 as for zero there is no left side, for n-1 there is no right side so stop before n-1
            int lb = pfMax[i-1];
            int rb = sfMax[i+1];
            int amount = Math.min(lb,rb)-A[i];
            if(amount>0){
                ans+= amount;
            }

        }

        return ans;
    }

    public int[] prefixMaxArray(int A[]){
        int n=A.length;
        int pfMax[] = new int[n];
        pfMax[0]=A[0];
        for(int i=1;i<n;i++){
            pfMax[i]=Math.max(pfMax[i-1],A[i]);
        }
        return pfMax;
    }
    public int[] suffixMaxArray(int A[]){
        int n=A.length;
        int sfMax[] = new int[n];
        sfMax[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            sfMax[i]=Math.max(sfMax[i+1],A[i]);
        }

        return sfMax;
    }
}
