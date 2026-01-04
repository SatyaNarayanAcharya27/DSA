// Given two sorted arrays arr1 and arr2 and an element k. The task is to find the element that would be at the kth position of the combined sorted array.

// Examples :

// Input: k = 5, arr1[] = [2, 3, 6, 7, 9], arr2[] = [1, 4, 8, 10]
// Output: 6
// Explanation: The final combined sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10. The 5th element of this array is 6.
// Input: k = 7, arr1[] = [100, 112, 256, 349, 770], arr2[] = [72, 86, 113, 119, 265, 445, 892]
// Output: 256
// Explanation: Combined sorted array is - 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892. 7th element of this array is 256.
// Expected Time Complexity: O(log(n) + log(m))
// Expected Auxiliary Space: O(log (n))


// brute-force approach
import java.util.*;
public class Position {

    int position(int a1[],int a2[],int k){
        int siz1=a1.length;
        int siz2=a2.length;
        int i=0,j=0;
        int c=0;
        int []temp=new int[siz1+siz2];
        while(i<siz1 && j<siz2){
            if(a1[i]<=a2[j]){
                temp[c]=a1[i];
                i++;
            }
            else{
                temp[c]=a2[j];
                j++;
            }
            c++;
        }

        while (i<siz1)    
        {    
             temp[c] = a1[i];    
                i++;    
                c++;    
        }    

        while (j<siz2)    
        {    
            temp[c] = a2[j];    
            j++;    
            c++;    
        }    
         
        for(i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
        return temp[k-1];
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Position obj = new Position();
      System.out.println("Enter the Size of the 1st array: ");
      int s1 = sc.nextInt();
      System.out.println("Enter the Size of the 2nd array: ");
      int s2 = sc.nextInt();
      int []arr1=new int[s1];
      int []arr2=new int[s2];  
    //   enter the elements of the 1st array
      for(int i =0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
      }
    //   entering the elements of the 2nd array
      for(int i =0;i<arr2.length;i++){
        arr2[i]=sc.nextInt();
      }
      System.out.println("Enter the value of k: ");
      int k = sc.nextInt();
      int pos = obj.position(arr1,arr2,k);
      System.out.println("The element at the "+k+"th position is: "+pos);
    }
}
