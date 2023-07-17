/*
Problem Description
Given two integer arrays A and B of size N each which represent values and weights associated with N items respectively.

Also given an integer C which represents knapsack capacity.

Find out the maximum total value that we can fit in the knapsack. If the maximum total value is ans, then return ⌊ans × 100⌋ , i.e., floor of (ans × 100).

NOTE:

You can break an item for maximizing the total value of the knapsack


Problem Constraints
1 <= N <= 105

1 <= A[i], B[i] <= 103

1 <= C <= 103



Input Format
First argument is an integer array A of size N denoting the values on N items.

Second argument is an integer array B of size N denoting the weights on N items.

Third argument is an integer C denoting the knapsack capacity.



Output Format
Return a single integer denoting the maximum total value of A such that sum of the weights of this subset is smaller than or equal to C.



Example Input
Input 1:

 A = [60, 100, 120]
 B = [10, 20, 30]
 C = 50
Input 2:

 A = [10, 20, 30, 40]
 B = [12, 13, 15, 19]
 C = 10


Example Output
Output 1:

 24000
Output 2:

 2105
*/

public class Solution {
    class Pair{
        int protein;
        int weight;
        double ppk;
        Pair(int aValue, int aWeight){
            this.protein = aValue;
            this.weight = aWeight;
            this.ppk =  (double)(this.protein*1.0)/(double)(this.weight);
        }
        public String toString(){
            return this.protein+"-"+this.weight+"-"+this.ppk;
        }
    }
    public int solve(int[] A, int[] B, int C) {

        // 1. prepare the array of pair classes with the given values form A and B
        int n = A.length;
        Pair arr[] = new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(A[i],B[i]);
        }
        // 2. sort the array based on the ppk values
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                return Double. compare(a. ppk, b. ppk);
            }
        });
       
        // add the elements with corresponding capacities and summarize the total capacity
        double ans = 0;
        for(int i=n-1;i>=0;i--){
            Pair p = arr[i];
            if(p.weight<=C){
                ans = ans+p.protein;
                C = C-p.weight;
            }else{
                ans = ans+(C*p.ppk);
                break;
            }
          
        }
        ans *= 1000;

        return (int)(ans / 10);

    }
}
