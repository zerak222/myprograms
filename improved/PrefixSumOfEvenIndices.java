import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
		int A[] = {1,2,3,4,5};
		int B[][]={{0,2},
		           {1,4}};
	    System.out.println(Arrays.toString(solve(A,B)));
        
    }
	
	public int[] solve(int[] A, int[][] B) {

        int [] preArray = new int[A.length];
        int sum=0;
        // make the presum array of even indices
        for(int i=0;i<A.length;i++){
            if(i%2==0){// only sum for even numbered indices
                sum=sum+A[i];
            }
            preArray[i]=sum;
            
        }        
        int retArray[]=new int[B.length];
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                int l= B[i][0];
                int r= B[i][1];
                if(l!=0){
                    retArray[i]=preArray[r]-preArray[l-1];
                }else{// for index 0 we cannot do -1 
                    retArray[i]=preArray[r];
                }
            }
        }
        return retArray;
    }

}