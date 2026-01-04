// finding the maximum number of 1s in the 2d array
package Array;
import java.util.*;
import java.lang.*;
public class Max {
    public int max(int[][]arr){
        int count =0,max_count=0;
        int max=-1;
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            count=0;
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max_count=count;
                max=i;
            }
            System.out.println();
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the Number of Columns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Displaying the elements of the Array which contains 0s and 1s: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Max obj = new Max();
        int res = obj.max(arr);
        System.out.println("The maximum number of consecutive 1's are present in : "+res+" row");
    }
}
