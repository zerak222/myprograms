import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       int arr[] ={1, 2, 3, 4};
       rotateArray(arr,3);
       System.out.println(Arrays.toString(arr));
		
     }
     
    public static void rotateArray(int a[],int k){
        
        int n = a.length;
         k=k%n;
        reverseArray(a,0,n-1);
        reverseArray(a,0,k-1);
        reverseArray(a,k,n-1);
    }
     
    public static int[] reverseArray(int a[],int s,int e){
        int n = a.length;
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
	 

