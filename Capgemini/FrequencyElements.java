// You’re given an array of integers, print the number of times each integer has
// occurred in the array.

import java.util.*;
public class FrequencyElements{
    static void frequency(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] hash= new int[max+1];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        // displaying the frequency of the elements of array
        for(int i=0;i<hash.length;i++){
            if(hash[i]>0){
                System.out.println(i+" occurs "+hash[i]+" times");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements in the array are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        frequency(arr);
    }
}