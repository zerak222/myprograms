public class Solution {
    public long solve(long A, int B) {
        long ans = A;
        for(int i=0;i<B;i++){
            if(checkBit(A,i)){
                ans = ans ^ (1<<i);
            }
        }
        return ans;
    }
    
    public boolean checkBit(long A, int i){
        if((A & (1<<i))==0){
            return false; // bit is '0' at Bth position.
        }
        return true; // bit is '1' at Bth position.
    }
}
