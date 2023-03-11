import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        int A[] = {3,9,4,-2,5,13,-7,8};
        int k= 4;

        System.out.println(solve(A,k));
        
    }

    public static int solve(int A[],int k){
        int ans = Integer.MIN_VALUE;
        int n = A.length;
        int s=0,e=k-1;
        int sum=0;
        int ps[]=getPfsumArray(A);
        while(e<n){
            sum=0;
            if(s==0){
                sum=ps[e];
            }else{
                sum=ps[e]-ps[s-1];
            }
            if(sum>ans){
                ans=sum;
            }
            s++;
            e++;
        }
        return ans;
    }
    public static int[] getPfsumArray(int A[]){
        int pfSumArray[]=new int[A.length];
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum= sum+A[i];
            pfSumArray[i]=sum;
        }

        return pfSumArray;
    }
}