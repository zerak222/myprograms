import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
        System.out.println(isPrime(3));
		
     }
     
    public static int isPrime(int n) {
        if(n<1){
            return 0;
        }
        if(n%2==0 || n%3==0){
            return 1;
        }
        if(countFactors(n)==2){
            return 1;
        }else{
            return 0;
        }
    }
	public static int countFactors(int n) {
        int count =0;
        for(int i=1;i<=n/i;i++){
            if(n%i==0){
                if(n/i==i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }	
     
}   
	 

