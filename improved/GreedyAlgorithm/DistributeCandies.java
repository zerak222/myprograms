/*
Problem Description

Akash wants to distribute candies on his birthday. There are A people and he has two types of candies. B candies of the first type and C candies of the second type.

He wants to distribute candies in such a way that no person has candies of both types and each person has at least one candy.
Let X denotes the minimum candies among all people after distribution of candies.
Find the maximum X.



Problem Constraints

2<=A<=B+C
1<=B<=10^9
1<=C<=10^9


Input Format

First argument is an integer A denoting number of people.
Second argument is an integer B denoting number of candies of first type.
Third argument is an integer C denoting number of candies of second type.


Output Format

Return an interger denoting the maximum X.


Example Input

A=4 B=4 C=5


Example Output

2
*/
public class Solution {
    // A people , B,C
    public int solve(int A, int B, int C) {
        int low = 1;
        int high = B+C;
        int ans =0;
        while(low <= high){
            int mid = (low+high)/2;
            int d1 = B/mid;
            int d2 = C/mid;
            int sum = d1+d2;
            if(sum>=A){
                ans =mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
      
}