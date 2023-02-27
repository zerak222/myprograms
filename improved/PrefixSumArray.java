import java.lang.*;
import java.util.*;
import java.math.*;
class Main {
	
	public static void main(String[] args) {
       
          int A[]= {4, 3, 2};
          System.out.println(Arrays.toString(prefixSumArray(A)));
          
		
     }
      public static int[] prefixSumArray(int[] A) {
           int sum = 0;
           for(int i=0;i<A.length;i++){
              sum = sum+A[i];
              A[i]=sum; 
           }
           return A;
      }
     
     
         
   
     
}   
	 

