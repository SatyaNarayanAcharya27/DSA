import java.util.*;
public class Twosum {

    int[] twosum(int[]a,int size,int target){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i]+a[j]==target && a[i]!=a[j]){
                    System.out.println("We found An element at index: "+i+" and "+j);
                    return new int[] {i,j};
                }
            }
        }
        // if no element found then 
        System.out.println("We can Not Find The Elements in the Array");
        return new int[]{-1,-1};
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // Creating an Array and inserting input by user
        System.out.println("Enter the Size of of the Array: ");
        int size=sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter Elements into an Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Twosum obj = new Twosum();
        System.out.println("\nEnter the Target Value: ");
        int target=sc.nextInt();
        int[]result= obj.twosum(arr,size,target);
    }
}
