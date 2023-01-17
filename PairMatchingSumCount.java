import java.lang.*;
import java.util.*;
class Main {

   public static void main(String[] args) {
		 int arr[]={1,1,1};
		
		System.out.print(solve(arr,2));
 }
public static int solve(int[] A, int B) {
        int count = 0;
        int n = A.length;
        for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
                if(A[i]+A[j]==B ){
                    count++;
                }
	        }	
        }
        return count;
    }
}   
	 

