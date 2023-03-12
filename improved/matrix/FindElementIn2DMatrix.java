import java.lang.*;
import java.util.*;
/*
    Given an matrix A of size NxN, which is row-wise and column-wise sorted. Find if the number B exists in the matrix.
*/
public class Main {
    public static void main(String[] args) {
        int A[][]={{1, 5, 6},
                {4, 8, 11},
                {7, 9, 14}
                };
        int k = 14;
        System.out.println(solve(A,k));
    }
    public static boolean solve(int A[][],int k){
        int r= A.length;//rows length
        int c=A[0].length; // cols length 
        int i=0;
        int j=c-1; // start with the first row last element (0,c-1)
        while(i<r && j>=0){
            if(A[i][j]==k){
                return true;
            }else if(A[i][j]>k){
                j--; // the element is greater than k , hence eliminate the column by decreasing it.
            }else if(A[i][j]<k){
                i++; // the element is less than k,  hence eliminate the row by increasing it.
            }
        }

        return false;
    }
}