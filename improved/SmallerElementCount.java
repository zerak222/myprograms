/*
we are given an array. For each element of this array, we have to find out the number of elements smaller than that element.
i.e. for each i (0<=i<arr.length) we have to find out count of elements less than the number arr[i]. For that we have to return an answer array.


Input Array: [5, 3, 2, 1, 2]
Output Array: [4, 2, 1, 0, 1]

*/


public class Solution{
	
		public static void main(String args[]){
			int[] arr = {5, 3, 2, 1, 2};
			int[] result = solve(arr);
        
			System.out.println("Input Array: " + Arrays.toString(arr));
			System.out.println("Count of Smaller Elements: " + Arrays.toString(result));
		}
		
		public int[] solve(int A[]){
			int n = A.length;
			int ans[] = new int[n];
			
			// Find the maximum element in the array
			int max = Integer.MIN_VALUE;
			for(int i=0;i<n;i++){
				max = Math.max(max,A[i]);
			}			
			// prepare the frequency array 
			int freq[] = new int[max+1];
			for(int i=0;i<n;i++){
				freq[A[i]]++;
			}
			// prepare the prefix of frequency array
			for(int i=1;i<freq.length;i++){
				freq[i]=freq[i]+freq[i-1];
			}
			
			// fill the ans array
			for(int i=0;i<n;i++){
				if(A[i]>0){
					ans[i] = freq[A[i]-1];
				}
			}
			return ans;
		}
}