/*
	All numbers (Using 1 and 2)
	Given N , print all n digit numbers formed by 1 and 2 in increasing order of numbers 
*/
public void solve(int N){
	int ans[] = new int[N];
	helper(N,ans,0);
}
public void helper(int N, int ans[], int i){
	if(i==N){
		// print ans array
		for(int val:ans){
			System.out.print(val+" ");
		}
		System.out.println();
	}
	ans[i]=1; // put 1 at ith index
	helper(N,ans,i+1);
	ans[i]=2;
	helper(N,ans,i+1);
}