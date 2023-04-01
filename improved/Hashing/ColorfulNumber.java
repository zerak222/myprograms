import java.util.*;

class Main {
	/*
	Given a number A, find if it is COLORFUL number or not.

    If number A is a COLORFUL number return 1 else, return 0.

    What is a COLORFUL Number:

    A number can be broken into different consecutive sequence of digits. 
    The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324 and 245. 
    This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
	 
     Ex: 
     1) A=23     
         2,
         3,
         2*3=6 
     o/p = 1
     
     2)A=236
         2,
         3,
         6
         2*3 = 6,
         3*6 = 18,
     o/p = 0
	*/
	public static void main(String args[]) {
		int A = 2345;
		System.out.println(mySolution(A));
        System.out.println(improvedSolution(A));
		
	}
	
	public static int mySolution(int A) {
        List<Integer> list = new ArrayList();        
        // find the largest power of 10 <=A
        int i=10;
        int divisor = 1;
        while (A / divisor >= 10) {
            divisor *= 10;
        }
        while(divisor>0){
            list.add(A/divisor);
            A = A%divisor;
            divisor=divisor/10;
        }
        int s=0;
        HashSet<Integer>hs = new HashSet();
        while(s<list.size()){
            int e=s;
            int product = 1;
            while(e<list.size()){
                product = product*list.get(e);
                if(hs.contains(product)){
                    
                    return 0;
                }
                hs.add(product);
                e++;
            }
            s++;
        }      
        return 1;
        
    }
    public static int improvedSolution(int A){
        String s = String.valueOf(A); // convert int to string
        int start=0;
        HashSet<Integer> hs = new HashSet();
        while(start<s.length()){
            int e=start;
            int product = 1;
            while(e<s.length()){
                char element = s.charAt(e); // get the char form of int value
                // convert char form to int again
                // Ex : ascii of '4' - ascii of '0' = 52-48 = 4,                
                int numElement = element-'0'; 
                product = product*numElement;
                if(hs.contains(product)){
                    return 0;
                }
                e++;
            }
            start++;
        }
        return 1;
    }
}