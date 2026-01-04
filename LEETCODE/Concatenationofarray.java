import java.util.*;
class Concatenationofarray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size= sc.nextInt();
        int [] arr =new int[size];
        System.out.println("Enter elements to an Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int []arr1=arr;
        System.out.println(arr1);
        //Concatenation of the two arrays
        // int[]result= new int[size*2];
        // result= arr + arr1;
        // System.out.print("The New Array after Concatenation of two arrays is: "+ result +" ");
    }
}