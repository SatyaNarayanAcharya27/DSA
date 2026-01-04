package BEGINNER;
//given a number .you have to print a series from that number to 1 using recursion
import java.util.*;

public class NumwtLoop {
    int series(int n){
        //using recursion
        //without using loops 
        if(n==1){
            System.out.println(n+"");;

        }
        else{
            return series(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumwtLoop obj = new NumwtLoop();
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int res= obj.series(num);
        System.out.println("The series from "+num+" to 1 is: "+res);
    }
}
