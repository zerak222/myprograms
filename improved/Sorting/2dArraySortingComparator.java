import java.util.*;

/*
    Sort 2d array based on x value, if x is same then sort based on y value. Sort in ascending order
    
     A = {  {3,6},
            {-1,5},
            {2,5},
            {0,4},
            {1,3},
            {2,-5}
        }
     
     O/p: 
        {
             {-1,5},
             {0,4},
             {1,3},
             {2,-5},
             {2,5},
             {3,6}               
        }
         
*/

class Main {
	
    static int count = 0;
	public static void main(String args[]) {
        Integer A[][] = {  {3,6},
                           {-1,5},
                           {2,5},
                           {0,4},
                           {1,3},
                           {2,-5}
                        };
        
        Arrays.sort(A,new Comparator<Integer[]>(){
            public int compare(Integer a[],Integer b[]){
                int x1 =a[0];
                int y1 =a[1];
                int x2 =b[0];
                int y2 =b[1];
                if(x1==x2){
                    return y1-y2;
                }else{
                    return x1-x2;
                }
            }
        });
        for(int i=0;i<A.length;i++){
            System.out.println(A[i][0]+" "+A[i][1]);
        }
        
	}
    
}