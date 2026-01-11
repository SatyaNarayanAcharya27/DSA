import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data= data;
    }
}
class BinaryTree{
    // creating a node 
    TreeNode root;
    Scanner sc = new Scanner(System.in);
    public TreeNode createNode(int data){
        if(root==null){
            root = new TreeNode(data);
            System.out.println("Root of the Binary Tree Created Sucessfully");
        }
        else{
            System.out.println("Root Node of the Tree is Already created, Do You want to insert it on Left or Right...: ");
            String res = sc.next();
            if(res.equals("yes")){
                System.out.print("Where do You want to insert the Node(Left/Right): ");
                res = sc.next();
                if(res.equals("Left")){
                    // Insert the Node in the Left part of the root
                    root.left = new TreeNode(data);
                }
                else{
                    // insert the Node at the right part of the Root
                    root=root.insertNodeAtRight(root,data);
                }
            }
        }
        return root;
    }
    // displaying the Nodes of the Binary tree

}
public class Representation{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.createNode(10);
        root = tree.createNode(20);
    }
}