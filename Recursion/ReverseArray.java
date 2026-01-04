package Recursion;
import java.util.*;
public class ReverseArray {
    static int[]reverse(int[]arr,int l,int r){
        if(l>=r){
            return arr;
        }
        else{
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            return reverse(arr,l+1,r-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,4,5};
        int l=0 , r= arr.length -1;
        int[]res=reverse(arr,l,r);
        System.out.println("Reverse Array");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }  
    }
}
