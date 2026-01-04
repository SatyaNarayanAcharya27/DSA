package STRINGS;
import java.util.*;
class Palindrome{
    public static boolean isPalindrome(String str){
        // String temp1=str;
        char[] arr= str.toCharArray();
        int beg=0 ,end = arr.length-1;
        while(beg<=end){
            if(arr[beg]!=arr[end]){
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the string: ");
        String str = sc.nextLine();
        boolean res = isPalindrome(str);
        System.out.println("The String is Palindrome or not: "+res);
    }
}