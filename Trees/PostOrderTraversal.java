package Trees;
public class PostOrderTraversal {
   //Node class to create the nodes
   class Node{
    int data;
    Node left, right;

    //Initialize the elements of node
    Node(int n){
        this.data = n;
        this.left = this.right = null;
    }
}

//Initialising the root node
Node root ;
PostOrderTraversal(int value){
    root = new Node(value);
}

//Function to add a new node to the tree
void add(Node node, int value){

   //Check if the value to be inserted is less than the value of node
    if(value<node.data){

        // if the left child of node is null new node will be inserted at that place
        if(node.left==null){
            node.left = new Node(value);
            System.out.println(value+" added to left of "+node.data);
        }

        // if the left child is not null recall tha add() with left child of the node
        else
            add(node.left,value);
    }

    // Check if the value to be inserted is greater than the value of node
    else if(value>node.data){

        // Check if right child of the node is empty new node is added at that place
        if(node.right==null){
            node.right = new Node(value);
            System.out.println(value+" added to right of "+node.data);
        }

        // if the rght child is not null recall the add() with the right child of the node
        else
            add(node.right,value);
    }
}

// Function for postorder traversal of tree which is (left,right,root)
void postorder(Node node){
    
    // check if the node is null return function call from that point
    if(node == null)
        return;

        // call the postorder function for left child
        postorder(node.left);

        // call the postorder function for right
        postorder(node.right);
    
        // Print the root data
        System.out.print(node.data+" ");

}
public static void main(String[] args) {

    // Initialize the tree with the root node
    PostOrderTraversal tree = new PostOrderTraversal(13);

    // Add new values to the tree
    tree.add(tree.root, 12);
    tree.add(tree.root, 10);
    tree.add(tree.root, 4);
    tree.add(tree.root,19);
    tree.add(tree.root, 16);
    tree.add(tree.root, 9);

    // Print the postorder traversal of the tree
    System.out.print("Postorder Traversal of tree is: ");
    tree.postorder(tree.root);
}
}
