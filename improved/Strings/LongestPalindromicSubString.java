public class Solution {
    public String longestPalindrome(String A) {
        int n= A.length();
        int length1=1;
        int startIndex = 0;
        int endIndex = 0;
        // odd length
        for(int i=1;i<n-1;i++){
            int p1=i-1;
            int p2=i+1;
            while(p1>=0 && p2<n && A.charAt(p1)==A.charAt(p2)){
                p1--;
                p2++;
            }
            int length = p2-p1-1;    
            if(length1<length){
                startIndex = p1;
                endIndex = p2;
                length1 = length;
            }
        }
        StringBuilder sb1 = new StringBuilder();
        if(startIndex == endIndex){
            sb1.append(A.charAt(startIndex));
        }else{
            for(int i=startIndex+1;i<endIndex;i++){
                sb1.append(A.charAt(i));
            }
        }
        // even length
         startIndex = 0;
         endIndex = 0;
        int length2=1;
        for(int i=0;i<n-1;i++){
            int p1=i;
            int p2=i+1;
            while(p1>=0 && p2<n && A.charAt(p1)==A.charAt(p2)){
                p1--;
                p2++;
            }
            int length = p2-p1-1;    
            if(length2<length){
                startIndex = p1;
                endIndex = p2;
                length2 = length;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if(startIndex == endIndex){
            sb2.append(A.charAt(startIndex));
        }else{
            for(int i=startIndex+1;i<endIndex;i++){
                sb2.append(A.charAt(i));
            }
        }
        
        if(length1>length2){
            return sb1.toString();
        }else{
            return sb2.toString();
        }
    }
    
}
