import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       int arr[] ={1,2,3,4};
        System.out.println(Arrays.toString(reverseArray(arr)));
		
     }
     
    public static int[] reverseArray(int a[]){
        int n = a.length;
        int s=0;
        int e=n-1;
        while(s<e){
            int temp = a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
        return a;
    }	
     
}   
	 

