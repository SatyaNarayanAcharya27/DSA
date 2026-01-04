package BINARYSEARCH;
import java.util.*;
public class Max1s {
    // brute force approach for solving the question still looking for optimal or better solution
    static int max1s(int [][]arr){
        // for this approach,assuming that the matrix is in sorted order
        int sum=0,max=Integer.MIN_VALUE;
        int rowno=0;
        for(int i=0;i<arr.length;i++){//this is the way to directly access row and column of the matrix
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                rowno=i;
            }
            sum=0;
        }
        if(max>0){
            return rowno;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the Number of Columns: ");
        int columns=sc.nextInt();
        int matrix[][]=new int[rows][columns];
        System.out.println("Enter the elements of the Matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int res=max1s(matrix);
        System.out.println("The Maximum number of 1's in the Matrix is present in row number: "+res);
    }
}
