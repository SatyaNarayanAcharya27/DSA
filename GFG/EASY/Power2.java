//program to check whether a number is a power of 2 or not
package EASY;
import java.util.*;
import java.math.*;
public class Power2 {
    private int Integer;
    boolean power(long num){
       if(num<=0){
        return false;
       }
       while(num>1){
        if(num%2!=0){
            return false;
           }
           num/=2;;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Power2 obj = new Power2();
        System.out.println("Enter Any Number: ");
        long n = sc.nextInt();
        boolean res = obj.power(n);
        System.out.println(res);
    }
}
