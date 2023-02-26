import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       int A[] = {0, 1, 0, 1};
       System.out.println(bulbs(A));
		
     }
     
     public static int bulbs(int[] A) {        
        
        int count=0;
        for(int i=0;i<A.length;i++){
            int number=A[i];
            if(count%2==1){
                A[i]=1-A[i];  // flip
            }
            if(A[i]==0){  // after flip if it is 0 then count should be increased
                count++;
            }
        }
        return count;
     }
     
     
         
   
     
}   
	 

