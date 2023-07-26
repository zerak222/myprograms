import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        
        helper(0,0,A-1,B-1,"");
        
    }
    public static void helper(int i,int j,int n, int m,String psf){
        if(i>n|| j>m){
            return;
        }
        if(i==n && j==m){
            System.out.println(psf);
        }
        // horizontal
        helper(i,j+1,n,m,psf+"h");
        // vertical
        helper(i+1,j,n,m,psf+"v");
    }
}