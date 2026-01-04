// Given an array arr, and an integer k, find the number of pairs of elements in the array whose sum is k.
// Example:-
// Input: k = 6, arr[] = [1, 5, 7, 1]
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.
// Expected time complexity is O(n)
package Array;
import java.util.*;
class CountPairs {
    int countPairs(int []arr,int val){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==val){
                    count++;
                }
            }
        }
        if(count!=0){
            return count;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountPairs obj = new CountPairs();
        System.out.println("Enter the Size of the Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+"Elemts into the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of the K: ");
        int k = sc.nextInt();
        int pairs=obj.countPairs(arr,k);
        System.out.println("The number of Pairs of Elements whose Sum is "+k+" is: "+pairs);
    }  
}
