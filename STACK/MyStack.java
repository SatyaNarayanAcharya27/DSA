import java.util.*;
import java.lang.*;
public class MyStack{
    public static void main(String[] args) {
        // Stack program using Stack<> collection framework
        Scanner sc = new Scanner(System.in);
        Stack<Integer>arr=new Stack<>(); //creating a new Stack using Stack framework
        arr.push(1); //pushing element into the Stack
        arr.push(2);
        arr.push(3);
        arr.peek();//showing the topmost element of the stack which is pointed by the top variable
        arr.pop();
        arr.size();//showing how many elements are there inside the Stack
        // arr.full(); i think there is no isFull() method is there to check for the overflow condition in stack
        arr.empty(); //checking the Stack is empty or not
        // displaying the elements in the Stack
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.());
        }
    }
}
