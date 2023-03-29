/*
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.

Ex:1
 A = [1, 2, 1, 3, 4, 3]
 B = 3
 O/p 
[2, 3, 3, 2]

 Ex:2
 A = [1, 1, 2, 2]
 B = 1
 O/p 
[1, 1, 1, 1]
*/


public class Solution {
    public int[] dNums(int[] A, int B) {
        int n= A.length;
        int ans[] = new int[n-B+1];
        HashMap<Integer,Integer>map = new HashMap();
        // create a frequencey map for first window (0->B)
        for(int i=0;i<B;i++){
            if(map.containsKey(A[i])){
                int key = A[i];
                int value = map.get(key);
                value++;
                map.put(key,value);
            }else{
                map.put(A[i],1);
            }
        }
        ans[0]=map.size();
        // apply sliding windo technique for remaining windows
        int s=1;
        int e=B;
        while(e<n){
            //remove A[s-1]
            if(map.containsKey(A[s-1])){
                int key=A[s-1];
                int value = map.get(key);
                if(value==1){
                    map.remove(key);
                }else{
                    value--;
                    map.put(key,value);
                }
            }
            // add A[e]
            if(map.containsKey(A[e])){
                int addKey = A[e];
                int addValue = map.get(addKey);
                addValue++;
                map.put(addKey,addValue);
            }else{
                map.put(A[e],1);
            }
            ans[s]=map.size();
            s++;
            e++;
        }
        return ans;
    }
}
