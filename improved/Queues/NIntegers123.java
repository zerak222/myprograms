/*
Given an integer, A. Find and Return first positive A integers in ascending order containing only digits 1, 2, and 3.

NOTE: All the A integers will fit in 32-bit integers.

Input 1 : 
	A = 3
Output 1 : 
	[1, 2, 3]

Input 2 :
	A = 7 
Output 2 : 
	[1, 2, 3, 11, 12, 13, 21]
*/

public class Solution{
		public int[] solve(int A){
				Queue<String> qu = new LinkedList();
				qu.add("1");
				qu.add("2");
				qu.add("3");
				int ans[] = new int[A];
				
				for(int i=0;i<A;i++){
						String ele = qu.remove();
						qu.add(ele+"1");
						qu.add(ele+"2");
						qu.add(ele+"3");
						ans[i]=Integer.parseInt(ele);
				}
				return ans;
		}
}