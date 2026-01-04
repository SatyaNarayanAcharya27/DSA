package Array;
class Sum{
    public static void main(String[]args){
        //Calculate Sum of the 5 floating elemets of an array
        float arr[] ={1.1f,2.2f,3.3f,4.4f,5.5f};
        float sum =0f;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.println("The Sum of THE array elements in the Float array is: "+sum);
    }
}

