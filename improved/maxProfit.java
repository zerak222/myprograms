import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       int A[] = {1, 4, 5, 2, 4};
       System.out.println(maxProfit(A));
		
     }
     // max profit = element - min element in left side of array.
     public static int maxProfit(int[] A) {        
        
         int maxProfit=0;
        int profit=0;
        int min = A.length==0?0:A[0]; // checking for zero element array
        for(int i=1;i<A.length;i++){
            profit = A[i]- min;    // starting with profit calculation
            if(profit>maxProfit){
               maxProfit = profit;  // update maxProfit
            }
           if(A[i]<min){        // check the min element in left side of array.
               min = A[i];
           }
           
           
        }
        return maxProfit;
     }
     
     
         
   
     
}   
	 

