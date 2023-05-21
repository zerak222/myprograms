public class Solution{
	public int[][] solve(int A[][]){
		 int n=A.length;
        Integer arr[][]= new Integer[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=A[i][0];
            arr[i][1]=A[i][1];
        }
        Arrays.sort(arr,new Comparator<Integer[]>(){
                public int compare(Integer a[],Integer b[]) {
                    int x1=a[0];
                    int y1=a[1];
                    int x2=b[0];
                    int y2=b[1];
                    int d1 = (x1*x1+y1*y1);
                    int d2 = (x2*x2+y2*y2);
                    
                    if(d1==d2){
                        if(x1!=x2){
                            return (x1-x2);
                        }else{
                            return y1-y2;
                        }
                    }else{
                        return (int)(d1-d2);
                    }
                    
                }
        });
        int ans[][] = new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=arr[i][0];
            ans[i][1]=arr[i][1];
        }
        return ans;
	}
}