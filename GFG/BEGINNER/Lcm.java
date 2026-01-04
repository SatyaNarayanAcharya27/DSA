package BEGINNER;
// program to find lcm of two numbers

// if gcd is given then the trick to find the lcm is
// LCM(a,b)=(a * b)/gcd(a,b)
import java.util.*;
public class Lcm {
    // brute force approach
    static int lcm(int a,int b){
        for(int i=a>b?a:b;i<a*b;i=i+(a>b?a:b)){
            if(i%a==0 && i%b==0)
                return i;
        }
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int res = lcm(a,b);
        System.out.println("The LCM of two numbers "+a+" and "+b+" is: "+res);
    }
}
