import java.lang.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) {
       
       int A[] = {16, 17, 4, 3, 5, 2};
       System.out.println(Arrays.toString(findLeaders(A)));
		
     }
     
     public static int[] findLeaders(int[] A) {
         int length = A.length;
         ArrayList<Integer> l1= new ArrayList();
         l1.add(A[length-1]);
         int max = A[length-1];
         
         for(int i=length-2;i>=0;i--){
             
             if(A[i]>max){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
                 l1.add(A[i]);
                 max=A[i];
             }
             
         }
         
         int retArray[] = new int[l1.size()];
         for(int i=0;i<l1.size();i++){
             retArray[i] =l1.get(i);
         }
         
         return retArray;
     
     }
     
     
         
   
     
}   
	 

