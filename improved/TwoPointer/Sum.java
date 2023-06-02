/*
	Given an array A of N integers, find three integers in A such that the sum is closest to a given number B. Return the sum of those three integers.

	Assume that there will only be one solution.
	
	Input 1 :
	A = [-1, 2, 1, -4]
	B = 1
	Output 1 : The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
	2
	
	Input 2:
	A = [1, 2, 3]
	B = 6
	Output 1 : 
	6
*/

public class Solution {
    public int threeSumClosest(int[] A, int B) {
        int n=A.length;
        if(n<3){
            int sum = 0;
            for(int i=0;i<n;i++){
                sum = sum+A[i];
            }
            return sum;
        }
        Arrays.sort(A);
        int closestSumTillNow = Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int a = i;
            int b = i+1;
            int c = n-1;
            while(b<c){
                int sum =A[a]+A[b]+A[c];
                int diff1 = (sum-B);
                long diff2 = (closestSumTillNow-B);
                long diff3 = (B-closestSumTillNow);
                if(Math.abs(diff2)>Math.abs(diff1)){
                    closestSumTillNow= sum;
                }
                if(sum>B){
                    c--;
                }else if(sum<B){
                    b++;
                }else{
                    return B;
                }
            }
        }
        
        return closestSumTillNow;
    }
}
