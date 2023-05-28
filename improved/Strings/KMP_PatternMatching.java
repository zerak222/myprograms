public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final String A, final String B) {
        if(A.length()<B.length()){
            return 0;
        }
        String str = B+"#"+A;  // # can be any special character which serves as a segregator
        int lps[] = getLps(str);
        int ans=0;
        for(int i=0;i<lps.length;i++){
            if(B.length()==lps[i]){
                ans++;
            }
        }
        return ans;
    }
    public int[] getLps(String str){
        int n = str.length();
        int lps[] = new int[n];
        lps[0]=0;
        for(int i=1;i<n;i++){
            int x=lps[i-1];
            while(str.charAt(x)!=str.charAt(i)){
                if(x==0){
                    x=-1;
                    break;
                }
                x=lps[x-1];
            }
            lps[i]=x+1;
        }
        return lps;
    }
}
