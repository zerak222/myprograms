import java.util.*;

public class Main {
  
    
    public static void main(String[] args) {
        int[] A = {5, 3, 2, 1, 4};       
       
        System.out.println(Arrays.toString(bubbleSort(A)));    
        System.out.println(Arrays.toString(insertionSort(A)));	
		
		System.out.println(Arrays.toString(mergeSort(A,0,A.length-1)));
        
    }	
	public static int[] bubbleSort(int A[]){
		 // bubble sort
        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-1;j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
		return A;
	}
	public static int[] insertionSort(int A[]) {
        for(int i=1;i<A.length;i++){
            for(int j=i;j>0;j--){
                if(A[j]<A[j-1]){
                    int temp = A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp;
                }
            }
        }
        return A;
	}
	public static int[] mergeSort(int A[],int low,int high){
		if(low==high){
			int sa[] = new int[1];
			sa[0]=A[low];
			return sa;
		}
		int mid=(low+high)/2;
		int A1[] = mergeSort(A,low,mid);
		int A2[] = mergeSort(A,mid+1,high);
		return mergeTwoSortedArrays(A1,A2);
	}
	public static int[] mergeTwoSortedArrays(int A[],int B[]){
		int n=A.length;
		int m=B.length;
		int i=0,j=0,k=0;
		int ans[] = new int[n+m];
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