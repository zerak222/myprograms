import java.lang.*;
import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();	
        
		System.out.print(isPerfectSquare(a));
		
	}
	 public static boolean isPerfectSquare(int A) {
         int i = 1; 
		 int square = 1;
         while(square<=A){
             square = i*i;
			 if(square ==A){
				 return true;
			 }
             i++;
         }
		 return false;
 
	}
}