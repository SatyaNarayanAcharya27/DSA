import java.util.*;
public class Demo {

    public class Node{
        // creating the node structure for the Linked List
        int data;
        Node next;
        // parameterised Node() Constructor for the user defined data
        Node(int data){
            this.data=data;
        }
    }
    //all the linkedList operation must be done within Ll class
    public class Ll{
        Node head;
        Ll(){
            this.head=null;
        }
        // append the node in the ll
        void append(int data){
            Node newNode = new Node(data);//creating node with the user-input data
            //if the Linked List is empty then the first node becomes the head
            if(head==null){
                head=newNode;
                return;
            }
        }

        // displaying the Nodes present in the LinkedList
        void display(){
            Node temp= head;
            while(temp.next!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
        }
        int count_nodes(){
            int count=0;
            Node temp=head;
            while(temp.next!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo demo = new Demo();
        // System.out.println("Enter the Data into the Node: ");
        // int data = sc.nextInt();
        // Node n = demo.new Node(data);
        // System.out.println(n.data);
        // System.out.println(n.next);
        //linking the nodes for the Linked List
        Ll obj = demo.new Ll();
        obj.append(10);
        obj.append(20);
        obj.append(30);
        obj.display();
        System.out.println("the number of the nodes present in the Linked List is: "+obj.count_nodes());
    }
}
