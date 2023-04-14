public class Solution {
    long count = 0;
    int mod = 1000000007;
    public int solve(int[] A) {
        int n=A.length;
        int sortedArray[] = mergeSort(A,0,n-1);
        return (int)(count%mod);

    }
    public int[] mergeSort(int A[],int low, int high){
        if(low == high){
            int sa[] = new int[1];
            sa[0]=A[low];
            return sa;
        }
        int mid = (low+high)/2;
        int arr1[] = mergeSort(A,low,mid);
        int arr2[] = mergeSort(A,mid+1,high);

        int ans[] = merge(arr1,arr2);

        return ans;
    }

    public int[] merge(int A[],int B[]){
        int n= A.length;
        int m= B.length;

        int i=0;
        int j=0;
        int k=0;
        int ans[] = new int[m+n];
        while(i<n && j<m){
            if(A[i]<=B[j]){
                ans[k]=A[i];
                i++;
                k++;
            }else{
                ans[k]=B[j];
                j++;
                k++;
                count+=(n-i);
                count= count%mod;
            }
        }
        while(i<n){
             ans[k]=A[i];
                i++;
                k++;
        }
        while(j<m){
            ans[k]=B[j];
                j++;
                k++;
        }
        return ans;
    }
   
}
