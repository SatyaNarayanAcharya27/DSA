class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data= data;
    }
}
public class Representation{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1); //creating the root node of the binary tree
        root.left = new TreeNode(2); // inserting a new node in the left part of root of the binary tree
        root.right = new TreeNode(3); //inserting a new node in the right part of the root of the binary tree
        
    }
}