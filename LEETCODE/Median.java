// median of the two sorted arrays
import java.util.*;
import java.lang.*;
public class Median {
    static double median(int a1[],int a2[]){
        double []result=new double[a1.length+a2.length];
        int n = result.length;
        result= merge(a1,a2);
        if(n%2==0){
            return (result[n/2]+result[((n/2)-1)])/2;
        }
        else{
            return result[n/2];
        }
    }
    static double [] merge(int a1[],int a2[]){
        double temp[]= new double[a1.length+a2.length];
        int i=0,j=0,k=0;
        while(i<a1.length){
            temp[k++]=a1[i++];
        }
        while(j<a2.length){
            temp[k++]=a2[j++];
        }
        Arrays.sort(temp);
        return temp;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int []arr1={5,3,2,4,1};
        int[]arr2={10,8,9,6,7};
        double n = median(arr1,arr2);
        System.out.println("Median of the two arrays is: "+n);
    }
}
