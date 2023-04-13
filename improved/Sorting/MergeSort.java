public class Solution {
    public int[] solve(int[] A) {
        int ans [] = mergeSort(A,0,A.length-1);
        return ans;
    }
    public int[] mergeSort(int A[],int low,int high){
        if(low == high){
            int sa[] = new int[1];
            sa[0]=A[low]; // can also be A[high] as both are equal
            return sa;
        }
        int mid = (low+high)/2;
        // sort A from low to mid
        int ar1[] = mergeSort(A,low,mid);
        // sort A from mid+1 to high
        int ar2[] = mergeSort(A,mid+1,high);

        int ans[] = mergeSortedArrays(ar1,ar2);
        return ans;
    }
    // merge two sorted arrays to get  a final sorted array
    public int[] mergeSortedArrays(int A[], int B[]){
        int n = A.length;
        int m = B.length;
        int ans[] = new int[n+m];
        int i=0;// pointer for A
        int j=0; // pointer for B
        int k=0;  // pointer for ans
        while(i<n && j<m){
            if(A[i]<B[j]){
                ans[k]=A[i];
                i++;
                k++;
            }else{
                ans[k]=B[j];
                j++;
                k++;
            }
        }
        // there can be elements remaining in A or B, but not both 
        while(i<n){
            ans[k]=A[i]; // remaining elements in A
            i++;
            k++;
        }
        while(j<m){
            ans[k]=B[j]; // remaining elements in B
            j++;
            k++;
        }
        return ans;
    }
}
