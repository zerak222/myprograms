import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       
       Scanner scn = new Scanner(System.in);

       int n=scn.nextInt();
       int A[][]=new int[n][n];
       
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               A[i][j]=scn.nextInt();
           }
       }
       int i=0,j=0;
       while(n>1){
           for(int k=1;k<n;k++){
               System.out.print(A[i][j]+" ");
               j++;
           }
           for(int k=1;k<n;k++){
               System.out.print(A[i][j]+" ");
               i++;
           }
           for(int k=1;k<n;k++){
               System.out.print(A[i][j]+" ");
               j--;
           }
           for(int k=1;k<n;k++){
               System.out.print(A[i][j]+" ");
               i--;
           }
           i++;
           j++;
           n=n-2;
       }
       if(n==1){
           System.out.print(A[i][j]+" ");
       }
       
        
    }
}