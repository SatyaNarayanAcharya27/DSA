package Array;
import java.util.Scanner;
public class ArrayUserInput {
   public static void main(String[]args){
    Scanner in = new Scanner(System.in);
   //  int []marks=new int[5];
      int[]marks={1,2,3,4,5,6};
   // System.out.println(marks.length);
      String[]arr={"Satya","Narayan","Acharya"};
   // System.out.println(arr.length);
      
   //Dispalying the array
      for(int i=0;i<marks.length;i++){
      System.out.print(marks[i]);
   }
   
//Displaying an Array using Reverse Order
      for(int i=marks.length-1;i>=0;i--){
      System.out.println(marks[i]);
   }

   //Using For each Loop
      for(int element:marks){
      System.out.println(element);
      }

   
   } 
}
