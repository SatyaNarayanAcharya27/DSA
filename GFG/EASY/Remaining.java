package EASY;

import java.util.*;
public class Remaining {
    String remaining(String arr,char ch,int count){
        int temp=0;
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)==ch){
                temp++;
            }
            if(temp==count){
                return arr.substring(i+1);
            }
        }
        return " ";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Remaining obj = new Remaining();
        System.out.println("Enter a String");
        String str = sc.next();

        System.out.println("Enter the character you want to search in the String: ");
        char c = sc.next().charAt(0);
        System.out.println("Enter the Number of times that character appeared in the String: ");
        int cnt = sc.nextInt();
        String res=obj.remaining(str,c,cnt);
        System.out.println("The remaining String is: "+res);
    }
}
