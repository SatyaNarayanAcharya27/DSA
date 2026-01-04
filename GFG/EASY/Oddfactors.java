package EASY;
// Given an integer N, count the numbers having an odd number of factors from 1 to N (inclusive).

// Example 1:
// Input:
// N = 5
// Output:
// 2
// Explanation:
// From 1 - 5 only 2 numbers,
// 1 and 4 are having odd number
// of factors.

// Example 2:
// Input:
// N = 1
// Output:
// 1
// Explanation:
// 1 have only 1(odd)
// factor

// Timecomplexity-O(sqrt(N)) , Cmpny tag-wipro

import java.util.*;
public class Oddfactors {
    int oddFactors(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Oddfactors obj = new Oddfactors();
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        int res  = obj.oddFactors(N);
        System.out.println("The number of odd factors from 1 to "+N+" are: "+res);
    }
}
