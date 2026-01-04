package BEGINNER;
//java program to find GCD of two numbers
// here i am solving this problem in 3 approaches
import java.util.*;

public class Gcd {
    public int gcd(int n1,int n2){
        /*  brute force approach
         int largest=1;
         for(int i=2;i<=n1;i++){
             if(n1%i==0 && n2%i==0){
                 largest=i;
             }
         }
         return largest;
         */

        /* better approach
        int largest=1;
        for(int i=n1;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                largest=i;
                break;
            }
        }
        return largest;
        */ 

        // optimal solution of the question using euclidean algorithm
        // remember this trick-
        // gcd(a,b)=gcd(a-b,b) , a>b
        // gcd(a,b)=gcd(a%b,b) , a>b

        while(n1!=0 && n2!=0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0)
          return n2;
        else
          return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gcd obj = new Gcd();
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int res = obj.gcd(a,b);
        System.out.println("The GCD of the two numbers "+a+" and "+b+" is: "+res);
    }
}
