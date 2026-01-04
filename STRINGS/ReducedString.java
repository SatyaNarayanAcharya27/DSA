package STRINGS;
import java.util.*;
// java program to count the number of Character present in the Array
public class ReducedString {
    static String reduceString(String str){
        if(str==null|| str.isEmpty()){
            return "";
        }
        // im using hashing here
        int hash[] = new int[26];
        StringBuilder s= new StringBuilder();
        // traversing the elements of the String to find the Elements in the String
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            hash[ch-'a']++;
        }
        //displaying the unique elements of the string with all its frequency
        for(int i=0;i<26;i++){
            s.append(i+'a'+hash[i]);
        }
        return s.toString();
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Any String: ");
      String str = sc.nextLine();
      String res = reduceString(str);  
      System.out.println(res);
    }
}
