public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int low =1; // min possible distance between two cows.
        int ans=0;
        int high = A[A.length-1]-A[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(A,B,mid)){
                low = mid+1;
                ans=mid;
            }else{
                high= mid-1;
            }
        }
        return ans;
    }

    public boolean isPossible(int A[],int B,int distance){
        int countCows=1;
        int j=0;
        for(int i=0;i<A.length;i++){
            if((A[i]-A[j])>=distance){
                j=i;
                countCows++;
            }
            if(countCows==B){
                return true;
            }
        }
        return false;
    }
}
