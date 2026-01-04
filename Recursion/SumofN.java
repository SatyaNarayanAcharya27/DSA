package Recursion;
import java.util.*;
public class SumofN {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int res = sum(num);
        System.out.println("The sum of the first "+num+" elements is: "+res);
    }
}
