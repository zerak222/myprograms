import java.lang.*;
import java.util.*;
class Main {

   public static void main(String[] args) {
		
		
		int A[][] ={{1, 2, 3},
		            {4, 5, 6},
					{7, 8, 9}};
			
		int B[][] ={{1, 2, 3},
		            {4, 5, 6},
					{7, 8, 9}};
					
        int retArr[][] =multiply(A,B);
		
        display(retArr);
        
    }
     public static int[][] multiply(int[][] A, int[][] B) {
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;
        if(c1!=r2){
            System.out.println("c1 Not matching r2");
        }
        int retArray[][]= new int [r1][c2];
        
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){ // can be c1 or r2
                    sum = sum+(A[i][k]*B[k][j]);
                }
                retArray[i][j]=sum;
            }
        }
        return retArray;
        
    }
    
    public static void display(int [][]arr){
        int rowsCount = arr.length;
        int colsCount = arr[0].length;
       for(int i=0;i<rowsCount;i++){
            for(int j=0;j<colsCount;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
       }
    }
}   
	 

