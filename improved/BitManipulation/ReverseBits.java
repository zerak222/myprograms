public class Solution {
	public long reverse(long A) {
        long rev =0;
        for(int i=0;i<32;i++){
            if(checkBit(A,i)){
                int k= 32-i-1;      
                rev = rev | (1L<<k); // '|' sets(changes to 1) the bit at given index
                 // 1L as k is very big only long can hold it.
            }
        }
        return rev;
	
	}

    public boolean checkBit(long A,int i){
        if((A & (1<<i))==0){
            return false;// implies the bit is '0' at ith index
        }
        return true; // bit at ith index is '1'
    }
}
