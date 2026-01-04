// Given an array of size n-1 such that it only contains distinct integers in the range of 1 to n. Return the missing element.

package Array;
import java.util.*;
public class MissingNumber {
    int missing(int size,int[]arr){
        int arrsum=0;
        int totalsum= size * (size+1)/2;
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];
        }
        // total sum ru array re jetiki ta element achi taku sum kari - kari dele amaku misisng number ta milijiba
        return totalsum-arrsum;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        MissingNumber obj = new MissingNumber();
        int n=sc.nextInt();
        int arr[]= new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int num=obj.missing(n,arr);
        System.out.println("The missing number is: "+num);
    }
}
