import java.lang.*;
import java.util.*;
class Main {
	static int maxOfArray(int a[]) {
       int max = a[0];
	   for(int i=0;i<a.length;i++){
		   if(max<a[i]){
			   max = a[i];
		   }
	   }
	   return max;
   }  

   public static void main(String args[]) {
	   
	   Scanner scn = new Scanner(System.in);
	   int size = scn.nextInt();
	   int a[]= new int[size];
	   for(int i=0;i<size;i++){
		   a[i]=scn.nextInt();
	   }
       System.out.print(maxOfArray(a));

   }
	 

}