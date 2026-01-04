package STRINGS;
// Accenture first coding question of mine
import java.util.*;
import java.lang.*;
public class Whitespacebalancer{
    public static String balancer(String s1,String s2){
        char ch=' ';
        int count1=0,count2=0;
        //calculating white spaces between str1
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==ch){
                count1++;
            }
        }
          //calculating white spaces between str2
          for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==ch){
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);;
        int diff=count1-count2;
        //checking the difference is even or odd
        if(diff%2==0)
            return "Even"+diff;
        else
            return "Odd"+diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1="Hello World";
        String str2="Hello Wo rld";
        String res = balancer(str1,str2);
        System.out.println("The white Space difference between two Strings is: "+res);
    }
}