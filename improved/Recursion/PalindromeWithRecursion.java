import java.util.*;

class Main {
	
	public static void main(String args[]) {
		String str = "naman";
		System.out.println(palindromWithRecursion(str));
		
	}
	
	public static int palindromWithRecursion(String A) {
        int s=0;
        int e=A.length()-1;
        if(isPalindrome(A,s,e)){
            return 1;
        }
        
        return 0;
    }
    
    public static boolean isPalindrome(String A,int s,int e){
        if(s==e || s>e){
            return true;
        }
        if(A.charAt(s)!=A.charAt(e)){
            return false;
        }else{
            return isPalindrome(A,s+1,e-1);
        }
    }
}