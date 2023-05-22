/*
Given n non-negative integers A[0], A[1], ..., A[n-1] , where each represents a point at coordinate (i, A[i]).

N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).

Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

Problem Constraints
	0 <= N <= 105

	1 <= A[i] <= 105



Input 1:

A = [1, 5, 4, 3] 

Output 1 : 6
-----------------------------------------
Input 2 : 

A = [1]

Output 2 : 0  as no container is formed

*/

public class Solution {
    public int maxArea(int[] A) {
        int i=0;
        int j=A.length-1;
        int ans=0;
        while(i<j){
            int amount = Math.min(A[i],A[j])*(j-i);
            ans = Math.max(ans,amount);
            if(A[i]<A[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
