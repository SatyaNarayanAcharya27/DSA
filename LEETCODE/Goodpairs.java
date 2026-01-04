import java.util.*;
class Goodpairs{
    int cheakpairs(int[] a,int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(a[i]==a[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
    
    void display(int[] a,int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(a[i]==a[j] && i<j){
                    System.out.println("Good pair Found at index "+i+" and index "+j);
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Taking "+size+" Elements for the Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements present in the Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        Goodpairs obj = new Goodpairs();
        int n = obj.cheakpairs(arr,size);
        System.out.println("The Number of Good Pairs in the Array is: "+n);
        obj.display(arr,size);
    }
}