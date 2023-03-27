import java.util.*;

class Main {
	/*
	Given two integer arrays, A and B of size N and M, respectively. 
	Your task is to find all the common elements in both the array.
	
	Each element in the result should appear as many times as it appears in both arrays.
	The result can be in any order.
	
		I/p : 
			A = [1, 2, 2, 1]
			B = [2, 3, 1, 2]
	 	O/p : 
		 	[1, 2, 2]
	 
	*/
	public static void main(String args[]) {
		int[]A = {2, 1, 4, 10};
		int[]B = {3, 6, 2, 10, 10};
		System.out.println(Arrays.toString(solve(A,B)));
		
	}
	
	static int[] solve(int[]A,int[]B) {
		//creating a freq map
		HashMap<Integer,Integer>map = new HashMap<>();		
		for(int i=0; i < A.length;i++) {
			if(map.containsKey(A[i]) == false) {
				//A[i] is coming first time
				map.put(A[i],1);
			}
			else {
				int temp = map.get(A[i]);
				temp++;
				map.put(A[i],temp);
			}
		}
		ArrayList<Integer> li = new ArrayList();
		//let's give the answer of every query 
		for(int i=0; i < B.length;i++) {
			int ele = B[i];		
			if(map.containsKey(ele)) {
				int val=map.get(ele);
				li.add(ele);
				val--;
				if(val==0){
					map.remove(ele);
				}else{
					map.put(ele,val);
				}
			}
		}
		int ans[] = new int[li.size()];
		for(int i=0;i<li.size();i++){
			ans[i]=li.get(i);
		}
		return ans;
	}
	
	
}