package EASY;

// Problem of the Day-14/07/2024

// Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

// Examples :

// Input: arr[] = [0, 0, 1, 1, 0]
// Output: [0, 0, 0, 1, 1]
// Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 1, 1].

// Input: arr[] = [1, 1, 1, 1]
// Output: [1, 1, 1, 1]
// Explanation: There are no 0s in the given array, so the modified array is [1, 1, 1, 1]

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Company Tags
// Paytm Goldman Sachs  Fab.com

import java.util.*;
public class Segregate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Segregate obj = new Segregate();
        System.out.println("Enter the Size of the array: ");
        int n = sc.nextInt();
        int []arr =new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         
    }
}
