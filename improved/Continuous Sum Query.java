import java.lang.*;
import java.util.*;

/*
  Q) There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

     Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
     For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, Given by the 2D array B

     I/p : 

     The first argument is a single integer A.
     The second argument is a 2D integer array B.

     A = 5
     B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

     O/p :
     Return an array(0 based indexing) that stores the total number of coins in each beggars pot.

     10 55 45 25 25
*/

public class Main {
    public static void main(String[] args) {
        
        int B[][]={
                    {1, 2, 10},
                    {2, 3, 20},
                    {2, 5, 25}
                  };
        System.out.println(Arrays.toString(solve(5,B)));
        
        
    }

    public static int[] solve(int A, int[][] B) {
        int n = A;
        int array[]= new int[n];
        for(int i=0;i<B.length;i++){

            int s = B[i][0];
            int e = B[i][1];
            int val = B[i][2];

            array[s-1]= array[s-1]+val; // s-1 because beggars start from 1 but in array idex starts from o
            if((e)<n){   // e was taken instead of e+1 because s-1 was taken instead of s
                array[e]= array[e]-val;
            }
        }
        System.out.println(Arrays.toString(array));
        // find the prefix sum array
        for(int i=1;i<n;i++){
            array[i]=array[i]+array[i-1];
        }
        return array;
    }
}