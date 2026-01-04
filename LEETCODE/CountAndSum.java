import java.util.*;
public class CountAndSum {
    public static String countAndSum(int n){
        if(n<=1){
            return " ";
        }
        String res = "1";
        for(int i=1;i<n;i++){
            res=result(res);
        }
        return res;
    }
    public static String result(String s){
        int count =1;
        StringBuilder sb = new StringBuilder(s);
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i-1)==sb.charAt(i)){
                count++;
            }
            else{
                sb=sb.append(count).append(sb.charAt(i));
                count=1;
            }
        }
        sb=sb.append(count).append(sb.length()-1);
        return sb.toString();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The numbers after encoding is: "+countAndSum(num));
    }
}
