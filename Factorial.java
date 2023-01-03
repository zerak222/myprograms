import java.lang.*;
import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
		System.out.print(fact(n));
		
	}
	
	public static int fact(int a){
		int fact=1;
		for(int i=1;i<=a;i++){
			fact = fact*i;
		}
		return fact;
	}
}