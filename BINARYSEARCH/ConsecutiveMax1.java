package BINARYSEARCH;
// find out the consecutive 1s present in an unsorted matrix. if it is there then return the row number otherwise return -1
import java.util.*;
import java.lang.*;
public class ConsecutiveMax1 {
    int max1s(int[][]arr){
        int large=-1,count=0,temp=0;
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count++;
                    large=Math.max(large,count);
                    temp=i;
                }
                else{
                    count=0;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the Number of columns: ");
        int col=sc.nextInt();
        int matrix[][]=new int[rows][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Displaying the matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        ConsecutiveMax1 obj = new ConsecutiveMax1();
        int res=obj.max1s(matrix);
        System.out.println("The maximum number of consecutive 1's are present in the matrix is: "+res);
    }
}
