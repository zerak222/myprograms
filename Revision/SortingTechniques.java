import java.util.*;

public class Main {
  
    
    public static void main(String[] args) {
        int[] A = {5, 3, 2, 1, 4};       
       
        System.out.println(Arrays.toString(bubbleSort(A)));    
        System.out.println(Arrays.toString(insertionSort(A)));	
        
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
	
	

}