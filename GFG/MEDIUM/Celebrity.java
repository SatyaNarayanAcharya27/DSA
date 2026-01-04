import java.util.*;
public class Celebrity {

    int celebrity(int [][]arr){
        int n=arr.length;
        int top =0,down =n-1;
        while(top<down){
            if(arr[top][down]==1){
                top++;
            }
            // else if(arr[down][top]==1){
            //     down--;
            // }
            else{
                // top--;
                down--;
            }
        }
        if(top> down)
            return -1;
        
        for(int i=0;i<n-1;i++){
            if(i!=top){
                
                if(arr[top][i]==1 || arr[i][top]==0){
                     return -1;
                }
            }
        }
        return top;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Matrix: ");
        int m = sc.nextInt();
        // int n = sc.nextInt
        int[][] mat = new int[m][m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print the Matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        Celebrity obj = new Celebrity();
        int res = obj.celebrity(mat);
        System.out.println("The celebrity is person: "+res);
    }
}
