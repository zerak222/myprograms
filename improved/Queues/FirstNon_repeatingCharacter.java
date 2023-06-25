/*
Given a string A denoting a stream of lowercase alphabets, you have to make a new string B.
B is formed such that we have to find the first non-repeating character each time a character is inserted to the stream and append it at the end to B. If no non-repeating character is found, append '#' at the end of B.

Input 1:

 A = "abadbc"
 
Output 1:

"aabbdd"

Input 2:

 A = "abcabc"
 
Output 2:

"aaabc#"
*/

public class Solution {
    public String solve(String A) {
        HashMap<Character,Integer> map = new HashMap();
        Queue<Character> qu = new LinkedList();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            // populate map
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }else{
                map.put(ch,1);
            }
            // populate queue
            if(map.get(ch)==1){
                qu.add(ch);
            }
            // prepare ans
            while(qu.size()>0 && map.get(qu.peek())>1){
                    qu.remove();
            }
            if(qu.size()==0){
                sb.append("#");
            }else{
                sb.append(qu.peek()+"");
            }

        }
        return sb.toString();
    }
}
