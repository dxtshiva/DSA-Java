package Trees;
// Inverting a BST is a process of creating mirror image of the tree. It involves swapping 
// the left and right child to create the final tree

public class InvertingBST {

    //Template to create a tree
    class Node{
        private Node left,right;
        private int data;
        Node(int value){
            this.data = value;
            left=right=null;
        }
    }
    
    //Defining the root node
    Node root;

    //Initializing the tree with root node
    public InvertingBST(int value) {
        root = new Node(value);
    }

    // Adding new elements to the tree
    protected void add(Node node,int value){
        if(value<node.data){
            if(node.left==null){
                System.out.println(value+" added to the left of "+node.data);
                node.left= new Node(value);
            }
            else
                add(node.left,value);
        }
        else if(value>node.data){
            if(node.right==null){
                System.out.println(value+" added to the right of "+node.data);
                node.right = new Node(value);
            }
            else
                add(node.right,value);
        }
    }
    
    // Method for inorder traversal of BST
    protected void inorder(Node node){
        if(node==null) 
            return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
   
    // Method to invert a binary tree
    protected Node invert(Node node) 
	{ 
		if (node == null) 
			return node; 

		// Recursevilly call the invert() for left and right child nodes to swap their values 
		Node left = invert(node.left); 
		Node right = invert(node.right); 

		// Swap the left and right child for inversion
		node.left = right; 
		node.right = left; 

        // return the nodes
		return node; 
	} 

    public static void main(String[] args) {

        // Initialize the object of tree
        InvertingBST tree = new InvertingBST(13);

        tree.add(tree.root, 12);
        tree.add(tree.root, 10);
        tree.add(tree.root, 4);
        tree.add(tree.root,19);
        tree.add(tree.root, 16);
        tree.add(tree.root, 9);

        // Print the inorder traversal of the tree
        System.out.print("Inorder Traversal of tree is: ");
        tree.inorder(tree.root);
        
        System.out.println();
        
        // Create a new node for the inverted tree
        Node invertedRoot = tree.invert(tree.root);

        // Printing the inorder traversal of the inverted tree
        System.out.print("Inorder Traversal of inverted tree is: ");
        tree.inorder(invertedRoot);
    }
}