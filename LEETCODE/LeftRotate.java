// leetcode problem no- 189
import java.util.*;
public class LeftRotate {
    static void leftrotate(int []arr,int n){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int []arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Displaying the elements in the Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number of times you want to rotate the Array: ");
        int n=sc.nextInt();
        leftrotate(arr,n);
    }
}
