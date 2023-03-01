import java.lang.*;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int counter=0;
        int totalSubArrays = n*(n+1)/2;
        int arr1[][]= new int[totalSubArrays][];
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
               arr1[counter] = new int[e-s+1];
               int size=0;
                for(int k=s;k<=e;k++){
                     arr1[counter][size]=arr[k];
                     size++;
                }
                counter++;
            }
        }
        
        System.out.println(Arrays.deepToString(arr1));
    }
}
	 

