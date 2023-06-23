/*
	Given an array of integers A.

A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.

Find the area of the largest rectangle formed by the histogram.

Input 1:

 A = [2, 1, 5, 6, 2, 3]
 
 Output 1:

 10
 
 Input 2:

 A = [2]
 Output 2:

 2

*/
public class Solution{
		public int largestRectangleArea(int A[]){
				int lsa[] = leftSmallestIndexArray(A);
				int rsa[] = rightSmallestIndexArray(A);
				int n=A.length;
				int largestArea = Integer.MIN_VALUE;
				for(int i=0;i<n;i++){
						int width = rsa[i]-lsa[i]-1;
						int height = A[i];
						int area = width * height;
						largestArea = Math.max(area,largestArea);
				}
				return largestArea;
		}
		public int[] leftSmallestIndexArray(int A[]){
				int n = A.length;
				int ans[] = new int[n];
				Stack<Integer> ms = new Stack();
				ans[0] = -1;
				st.push(0);
				for(int i=1;i<n;i++){
						int x = A[i];
						while(ms.size()>0 && A[ms.peek()]>=x){
								ms.pop();
						}
						if(ms.size()==0){
								ans[i]=-1;
						}else{
								ans[i]=ms.peek();
						}
						ms.push(i);
				}
				return ans;
		}
		public int[] rightSmallestIndexArray(int A[]){
			int n = A.length;
			int ans[] = new int[n];
			Stack<Integer> ms = new Stack();
			ans[n-1] = n;
			st.push(n-1);
			for(int i=n-2;i>=0;i--){
					int x = A[i];
					while(ms.size()>0 && A[ms.peek()]>=x){
							ms.pop();
					}
					if(ms.size()==0){
							ans[i]=n;
					}else{
							ans[i]=ms.peek();
					}
					ms.push(i);
			}
			return ans;
			
		}
}