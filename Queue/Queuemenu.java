package Queue;
import java.util.*; 
import java.lang.*;
class Queuemenu{
    static int size = 5;
    static int[] queue = new int[size];
    static int front = -1,back=-1;
    public static void enqueue(int data){
        // cheking if the queue is full or not
        if(back == size-1){
            System.out.println("Cant insert because the queue is full");
            return;
        }
        // check if the queue has some elements or no elements
        if(front == -1 && back==-1){
            front =0;
            back =0;
        }
        queue[back]=data;
        back++;
    }

    public static void dequeue(){
        // check if the queue is empty or not
        if(front == -1 || front == back){
            System.out.println("Queue is empty");
        }
        else{
            int data = queue[front];
            System.out.println("Data deleted from the queue is: "+data);
            front++;
        }

        // checking if front is at same position as back
        if(front == back){
            front =-1;back=-1;
        }
    }

    public static void isEmpty(){
        if(front==-1 || front==back){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }

    public static void isFull(){
        if(back == size-1){
            System.out.println("Queue is Full");
        }
        else{
            System.out.println("Queue is not full");
        }
    }

    public static int front(int queue[]){
        if(front==-1 || front==back){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public static int back(int queue[]){
        if(front==-1 || front==back){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[back-1];
    }

    public static void display(int[]queue){
        if(front==-1 || front==back){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<back;i++){
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Menu Driven Programme to Implement Queue Data Structure: ");    
        System.out.println("*************************************************************");
        System.out.println("1.Enter elements to the Queue");
        System.out.println("2.Delete Elements present in the Queue");
        System.out.println("3.Check if the Queue is Empty or not");
        System.out.println("4.Check if the Queue is Full or not");
        System.out.println("5.Which one is standing at the front of the Queue");
        System.out.println("6. Which one is Standing At the back of the Queue");
        System.out.println("7. Display elements present in the Queue");
        System.out.println("8.Exit");
        System.out.println("Enter Your choice");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the Element you wnat to insert into the Queue: ");
                int data = sc.nextInt();
                enqueue(data);
                System.out.println("Element "+data+" inserted into the Queue");
                break;
            case 2:
                System.out.println("Delete the element from the Queue: ");
                dequeue();
                System.out.println("Element deleted from the Queue");
                break;
            case 3:
                System.out.println("is the queue empty or not: ");
                isEmpty();
                break;
            case 4:
                System.out.println("is the queue full or not: ");
                // int data = sc.nextInt();
                isFull();
                // System.out.println("Element "+data+" inserted into the Queue");
                break;
            case 5:
                System.out.println("Front element of the Queue: "+front(queue));
                break;
            case 6:
                System.out.println("Back element of the Queue: "+back(queue));
                break;
            case 7:
                System.out.println("Displaying Elements of the Queue: ");
                display(queue);
                break;
            case 8:
                System.out.println("Exiting from the Program");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
        }
    }
}