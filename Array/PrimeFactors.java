package Array;
import java.util.*;
public class PrimeFactors {
    public int[]primefactors(int n){
        int []arr={0};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int []res= primefactors(num);
        System.out.println("The Unique prime factors of the number is "+res);
    }
}
