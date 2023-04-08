import java.util.*;

/*
    Given an array, find if there is a pair such that A[i]+A[j]=k and i!=j;
*/

class Main {
	
	public static void main(String args[]) {
        int A[] = {2,3,1,3,2,7,10,2};
        System.out.println(solve(A,12));
        /*searching left is the key, when we get to 10 , we will 
          search for 2 which is coming twice, hence count becomes 2
          when we get to 2 at index 7 we search for 10, which comes 
          once, hence the count +1 is added to 2 , total count 3
        */
	}
	
	public static int solve(int A[], int k) {
        int n= A.length;
        HashMap<Integer,Integer>map = new HashMap();
        int count =0;
        for(int i=0;i<n;i++){
            if(map.containsKey(k-A[i])){
                count+=map.get(k-A[i]);
            }
            if(map.containsKey(A[i])){
                int temp = map.get(A[i]);
                temp++;
                map.put(A[i],temp);
            }else{
                map.put(A[i],1);
            }
        }
        return count;
        
    }
}