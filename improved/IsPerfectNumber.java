import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       
      // Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

       // A proper divisor of a natural number is the divisor that is strictly less than the number.
       System.out.println(isPerfectNumber(4));
       
		
     }
     
     public static int isPerfectNumber(int a){         
         int sumOfDivisors = 0;
         
         for(int i=1;i<=a/i;i++){
             
             if(a%i==0){
                 if(a/i!=i){
                     sumOfDivisors=sumOfDivisors+i;
                     if(a/i!=a){
                        sumOfDivisors=sumOfDivisors+a/i;
                     }
                 }
             }             
         }
         
         if(sumOfDivisors==a){
             return 1;
         }else{
             return 0;
         }
     }
     
   
     
}   
	 

