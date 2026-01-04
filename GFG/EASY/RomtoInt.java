package EASY;
// Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000

// Example 1:

// Input:
// s = V
// Output: 5
// Example 2:

// Input:
// s = III 
// Output: 3
// Your Task:
// Complete the function romanToDecimal() which takes a string as input parameter and returns the equivalent decimal number. 

// Expected Time Complexity: O(|S|), |S| = length of string S.
// Expected Auxiliary Space: O(1)

import java.util.*;
class RomtoInt{
    int convert(String s){
        int sum=0;
        int i=0;
        while(i<s.length()-1){
            if(num(s.charAt(i))<num(s.charAt(i+1))){
                sum-=num(s.charAt(i));
            }
            else{
                sum+=num(s.charAt(i));
            }
            i++;
        }
        sum=sum+num(s.charAt(s.length()-1));
        return sum;
    }

    int num(char c){
        c= Character.toUpperCase(c);
        if(c=='I'){
            return 1;
        }
        else if(c=='V'){
            return 5;
        }
        else if(c=='X'){
            return 10;
        }
        else if(c=='L'){
            return 50;
        }
        else if(c=='C'){
            return 100;
        }
        else if(c=='D'){
            return 500;
        }
        else if(c=='M'){
            return 1000;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RomtoInt obj = new RomtoInt();
        System.out.println("Enter a Roman Number: ");
        String rom = sc.nextLine();
        int res=obj.convert(rom);
        System.out.println("The equivalent decimal number of the Roman number "+rom+" is: "+res);
    }
}