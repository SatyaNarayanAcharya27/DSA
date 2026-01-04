package Array;
import java.util.*;
class BinarySearch {
    int binarySearch(int[]a,int val){
        int n = a.length;
        int beg =a[0];
        int end=a[n-1],flag=0;
        int mid=0;
        while(beg<=end){
            mid = (beg+end)/2;
            if(a[mid]==val){
                flag=1;
            }
            else if(a[mid]>val){
                end=mid;
            }
            else{
                beg=mid+1;
            }
        }
        if(flag!=0){
            return mid;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,4,5};
        System.out.println("Enter the Elemnt You want to Search: ");
        int k = sc.nextInt();
        BinarySearch obj = new BinarySearch();
        int res = obj.binarySearch(arr,k);
        System.out.println("The Elemnt is found at index: "+res);
    }
}
