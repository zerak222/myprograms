import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=scn.nextInt();
        }

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum = sum+A[j];
                System.out.print(sum+" ");
            }
        }
        
    }
}