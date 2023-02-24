import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       int A[] = { 5, -2, 3 , 1, 2};
       System.out.println(pickFromBothSides(A,3));
		
     }
     
     public static int pickFromBothSides(int[] A,int B) {        
        
        int sum = 0 ;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        
        int max = sum;
        int j=A.length-1;// keep the pointer at the end of array
        for(int i=B-1;i>=0;i--){
            sum =sum-A[i];
            sum = sum+A[j];
            if(max<sum){
                max = sum;
            }
            j--; // move the pointer backwards            
        }
        
        return max;
     }
     
     
         
   
     
}   
	 

