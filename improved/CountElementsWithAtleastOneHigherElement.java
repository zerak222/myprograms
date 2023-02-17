import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       int a[]={3,1,2};
       System.out.println(countElements(a));
       
		
     }
     
     public static int countElements(int a[]){
         int count =0;
         int max = a[0];
         for(int i=0;i<a.length;i++){
             if(a[i]>max){
                 max = a[i];
             }
             
         }
         for(int i=0;i<a.length;i++){
             if(a[i]<max){
                 count++;
             }
         }
         
         return count;
         
     }
         
   
     
}   
	 

