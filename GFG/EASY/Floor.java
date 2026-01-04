package EASY;
import java.util.*;
public class Floor {
    int floor(int[]a,int t){
        int beg=0,end=a.length-1;
        while(beg<=end){
            int mid =(beg+end)/2;
            if(t==a[mid]){
                return mid;
            }
            else if(t<a[mid]){
                end =mid-1;
            }
            else{
                beg=mid+1;
            }
        }
        //before printing the floor value,first check whether the end index  value becomes -1 , if this then this may lead to Array index out of bound exception(this thing arises when the target element is less than all the elements in the Array),to deal with that here is the condition

        if(end<0){
            return -1;
        }

        // if the beg exceeds end and the  target value > the value present at the index end , then this end value is the floor of the Target value
        
        // if(t>a[end]){
            return end; // You can also return end directly, as it is pointing towards the floor value
        // }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        Floor obj = new Floor();
        int res = obj.floor(arr,target);
        System.out.println("The floor of the target value is: "+res);
    }
}
