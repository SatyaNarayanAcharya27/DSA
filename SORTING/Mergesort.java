public class Mergesort {

    public static void mergesort(int []arr,int beg,int end){
        if(beg<end){ //this is the base case condtition
            int mid=(beg+end)/2;
            mergesort(arr,beg,mid);
            mergesort(arr,mid+1,end);
            merge(arr,beg,mid,end);
        }    
    }
    public static void merge(int []arr,int beg,int mid,int end){
        int[] temp= new int[end-beg+1];
        int left=beg;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k]=arr[left];
            left++;
            k++;
        }
        while(right<=end){
            temp[k]=arr[right];
            right++;
            k++;
        }
        //copying the sorted elements back to the original array
        for(int i=0;i<temp.length;i++){
            arr[beg+i]=temp[i];
        }
    }
    public static void main(String[] args){
        int []arr={9,8,7,6,5,4,3,2,1};
        int beg=0,end=arr.length-1;
        mergesort(arr,beg,end);
        //displaying the elements of the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
