import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //improved solution of max sum subarray of length k 
        // Technique used : Apply carry forward on fixed length subarray.
        int A[] = {3,9,4,-2,5,13,-7,8};
        int k= 4;

        System.out.println(solve(A,k));
        
    }

    public static int solve(int A[],int k){        
        int n = A.length;
        int sum = 0;
        // calculate the sum of subarray of length k for index 0
        for(int i=0;i<k;i++){
            sum+=A[i];
        }
        int ans=sum;
        int s=1,e=k;
        while(e<n){
            sum=sum-A[s-1]+A[e];
            if(sum>ans){
                ans=sum;
            }
            s++;
            e++;
        }
        return ans;
    }
    
}