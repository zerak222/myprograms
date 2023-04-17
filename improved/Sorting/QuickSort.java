public class Solution {
    public int[] solve(int[] A) {
        int n=A.length;
        quickSort(A,0,n-1);
        return A;
    }

    public void quickSort(int A[],int low , int high){
        if(low>=high){
            return;
        }
        int pivot = A[high];
        int pi = partition(A,low,high,pivot);
        quickSort(A,low,pi-1);
        quickSort(A,pi+1,high);
    }
    public int partition(int A[],int low,int high,int pivot){
        int i=low,j=low;
        while(j<high){
            if(A[j]>=pivot){
                j++;
            }else{
                // swap A[i],A[j]
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j++;
            }
        }
        // swap A[i],A[high]
        int temp = A[high];
        A[high]=A[i];
        A[i]=temp;
        return i;
    }
   
}
