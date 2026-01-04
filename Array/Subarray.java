import java.util.*;
class Subarray{
    static int[]subarray(int[]arr){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // displaying elements of the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // finding the subarrays who 
        int[]res=subarray(arr);
    }
}