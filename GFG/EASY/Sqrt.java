// Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).
// Expected Time Complexity: O(log N)
// Expected Auxiliary Space: O(1)
// Company Tags - VMWare  Flipkart  Accolite  Amazon  Microsoft
package EASY;
import java.util.*;
class Sqrt{

    //  time complexity is - O(n) its the brute force approach
    long squareroot(long value){
        long temp = 0;
        for(int i=1;i<=value;i++){
            if(i * i>value){
                temp = i -1;
                break;
            }
        }
        return temp;
}
    // long squareroot(long val){
    //     // this is the optimal solution having time complexity O(logn) 
    //     long beg=1,end=val,mid=0,temp=0,result=0;
    //     while(beg<=end){
    //         mid=(beg+end)/2;

    //         if(mid * mid == val){
    //             return mid;
    //         }
    //         else if(mid * mid < val){
    //             beg=mid+1;
    //             result=mid;
    //         }
    //         else{
    //             end=mid-1;
    //         }
    //     }
    //     return result;
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = sc.nextInt();
        Sqrt obj = new Sqrt();
        long res = obj.squareroot(num);
        System.out.println("The SQUAREROOT of "+num+" is: "+res);
    }
}