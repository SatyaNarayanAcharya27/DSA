package EASY; //solved 

// Given an array of size n-1 such that it only contains distinct integers in the range of 1 to n. Return the missing element.

// Examples:

// Input: n = 5, arr[] = [1,2,3,5]
// Output: 4
// Explanation : All the numbers from 1 to 5 are present except 4.

// Input: n = 2, arr[] = [1]
// Output: 2
// Explanation : All the numbers from 1 to 2 are present except 2.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Flipkart Morgan Stanley Accolite Amazon Microsoft D-E-Shaw Ola Cabs Payu Visa Intuit Adobe Cisco Qualcomm TCS


import java.util.*;
public class Missing {
    int missing(int val,int[]arr){
        int arraysum=0;
        int totalsum=(val*(val+1)/2);
        for(int i=0;i<val;i++){
            arraysum+=arr[i];
        }
        return totalsum-arraysum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Missing obj = new Missing();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is: ");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }

        int num = obj.missing(n,arr);
        System.out.println("The missing number is: "+num);
    }
}
