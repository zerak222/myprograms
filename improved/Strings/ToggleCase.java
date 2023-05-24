/*
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.

Input 1: A = "Hello" 
Output 1 : hELLO

Input 2: A = "tHiSiSaStRiNg"
Output 2 : ThIsIsAsTrInG 
*/


public class Solution {
    public String solve(String A) {
        int n=A.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch= A.charAt(i);
            if(ch>='a' && ch<='z'){
                ans.append((char)(ch-32));
            }else if(ch>='A' && ch<='Z'){
                ans.append((char)(ch+32));
            }
        }
        return ans.toString();
    }
}