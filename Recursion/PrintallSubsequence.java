package Recursion;
import java.util.*;
public class PrintallSubsequence {
    static void printsubsequence(int i,int[]arr,ArrayList<Integer>list){
        if(i==arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        printsubsequence(i+1,arr,list);
        list.remove(list.size()-1);
        printsubsequence(i+1,arr,list);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // displaying the Elements of Array;
        System.out.println("The elements in array are:");
  	    for(int i=0;i<size;i++){
  		     System.out.print("\t"+arr[i]);
        }
        int i=0;
        System.out.println();
        ArrayList<Integer>list=new ArrayList<>();
        printsubsequence(i,arr,list);
    }
}
