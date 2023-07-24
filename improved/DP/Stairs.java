/*
Problem Description

You are climbing a staircase and it takes A steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Return the number of distinct ways modulo 1000000007



Problem Constraints
1 <= A <= 105



Input Format
The first and the only argument contains an integer A, the number of steps.



Output Format
Return an integer, representing the number of ways to reach the top.



Example Input
Input 1:

 A = 2
Input 2:

 A = 3


Example Output
Output 1:

 2
Output 2:

 3

*/

public class Solution{
	
	int mod = 1000000007;
	public int climbStairs(int A){
		int str[] = new int[A+1];
        if (A==1){
            return 1;
        }
        Arrays.fill(str,-1);
        int ans = findWays(A,str);
        return ans;
	}
	public int findWays(int A,int str[]){
		// base case 
		if(A==1 || A==2){
			str[A]=A;
			return str[A];
		}
		// check storage
		if(str[A]!=-1){
			return str[A];
		}
		int p1 = findWays(A-1,str);
		int p2 = findWays(A-2,str);
		str[A]=(p1%mod+p2%mod)%mod;
		return (p1%mod+p2%mod)%mod;
	}
}