import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reversedString(str,str.length()-1);

        
    }
    public static void reversedString(String str,int e){
        if(e<0){
            return;
        }
        System.out.print(str.charAt(e));
        reversedString(str,e-1);

    }
}