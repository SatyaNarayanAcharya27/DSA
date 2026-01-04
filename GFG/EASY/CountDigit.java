package EASY;
// Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

// Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 

// Examples :

// Input: n = 12
// Output: 2
// Explanation: 1, 2 when both divide 12 leaves remainder 0.

// Input: n = 2446
// Output: 1
// Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.

// Input: n = 23
// Output: 0
// Explanation: 2 and 3, none of them divide 23 evenly.

// Expected Time Complexity: O(log n)
// Expected Space Complexity: O(1)


import java.util.*;
public class CountDigit {
    int countDigit(int num){
        int tempval=num,count=0;
        while(tempval!=0){
            int rem = tempval%10; 
            if(rem!=0 && num%rem==0){ //checking the reminder is 0 or not ,  coz if it is 0 then throws ArithmeticException can not / 0 
                count++;
            }
            tempval/=10;
        }
        if(count==0){
            count = -1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountDigit obj = new CountDigit();
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int res=obj.countDigit(number);
        System.out.println("The number "+number+" is divisible by "+res+" digits present within it");
    }
}
