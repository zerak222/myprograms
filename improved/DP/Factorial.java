/*
Problem Description
Given a positive integer A, write a program to find the Ath Fibonacci number.

In a Fibonacci series, each term is the sum of the previous two terms and the first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1. Hence, f(2) = 1, f(3) = 2, f(4) = 3 and so on.

NOTE: 0th term is 0. 1th term is 1 and so on.



Problem Constraints
0 <= A <= 44



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the Ath Fibonacci number.



Example Input
Input 1:

 A = 4
Input 2:

 A = 6


Example Output
Output 1:

 3
Output 2:

 8
*/

import java.lang.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int str[] = new int[n+1];
		Arrays.fill(str,-1);
		int ans = fibonacciNumber(n,str);
		System.out.println(ans);
	}
	public static int fibonacciNumber(int n,int str[]){
		// base case 
		if(n==0 ||n ==1){
			str[n]=n;
			return str[n];
		}
		// check in str for repeated case 
		if(str[n]!=-1){
			return str[n];
		}
		// actual logic 
		int a1 = fibonacciNumber(n-1,str);
		int a2 = fibonacciNumber(n-2,str);
		str[n]=a1+a2; // store it in the str array for using in next iteration
		return a1+a2;
	}
}