import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
        System.out.println(countFactors(4));
		
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
	 

