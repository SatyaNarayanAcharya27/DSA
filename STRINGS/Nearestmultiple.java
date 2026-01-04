package STRINGS;
import java.util.*;
import java.io.*;
public class Nearestmultiple {
    static String roundtoNearest(String str){
        // first converting from string to number
        long num = Long.parseLong(str);
        long rem= num%10;
        long temp=10-rem;
        if(rem>5){
            return Long.toString(num+temp);
        }
        else{
            return Long.toString(num-rem);
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any number: ");//remember the input must be taken in the form of the String
    String str= sc.nextLine();
    String res = roundtoNearest(str);
    System.out.println("The Nearest number is: "+res);
   } 
}
