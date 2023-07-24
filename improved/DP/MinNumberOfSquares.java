/*
Problem Description
Given an integer A. Return minimum count of numbers, sum of whose squares is equal to A.



Problem Constraints
1 <= A <= 105



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the minimum count.



Example Input
Input 1:

 A = 6
Input 2:

 A = 5


Example Output
Output 1:

 3
Output 2:

 2
*/

public class Solution {
    
    public int countMinSquares(int A) {
		int str[] = new int[A+1];
		Arrays.fill(str,-1);
		int ans = solve(A,str);
		return ans;
	}
	
	public int solve(int A,int str[]){
		// base case
		if(A==0 || A==1){
			str[A]=A;
			return str[A];
		}
		// existing case
		if(str[A]!=-1){
			return str[A];
		}
		// actual logic 
		int temp = Integer.MAX_VALUE;
		for(int i=1;i*i<=A;i++){
			int count = solve(A-i*i,str);
			temp = Math.min(temp,count);
		}
		str[A]=temp+1;
		return temp+1;
	}
}