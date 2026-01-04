// Linked List Pure Menu driven program without using Collections framework
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class Linkedlist{
    static Node head = null; //head of the linked list which is used in maximum operations

    //fundtions for creting the number of node in the Linkedlist and inserting them into the linked list
    public static void createNode(int n){
        for(int i= 1;i<=n;i++){
            Node node= new Node(i);
            // check if the head is empty then add the first nodes address into the Head of the linkedlist
            if(head==null){
                head=node;
            }
            // if the head contains something then simply make a temporary node and traverse it until you reach the last of the list
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                // when we reach the end of the linked list then we insert the node into the linked list
                temp.next=node;
            }
        }
    }

    // displaying the number of nodes present in the linked list
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  Linked list Menu Driven program without using Collection framework");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1: Enter the number of node into the linked list: ");
        System.out.println("2: Display the linked list: ");
        System.out.println("3: Insert the node at the Beginning of the linked List");
        System.out.println("4: Insert the node at the end of the linked List");
        System.out.println("5: Insert the node at the specific position of the linked List");
        System.out.println("6: Delete the Node of the linked list from the beginning: ");
        System.out.println("7: Delete the Node of the linked list from the end: ");
        System.out.println("8: Delete the Node of the linked list from the specific position: ");
        System.out.println("9: Count the number of the nodes present in the linked list: ");
        System.out.println("10: Exit: ");
        System.out.println("11: Reverse the linked list: ");
        while(true){
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    int number=sc.nextInt();
                    System.out.println("Create "+number+" number of nodes in the Linked List: ");
                    createNode(number);
                    break;
                case 2:
                    System.out.println("Display the Linked List:");
                    display(head);
                    break;
                default:
                    System.out.println("Invalid choice");
                    

            }
        }
    }
}