package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCreation {

    class Node{
        int data;
        Node left, right;

        Node(int n){
            this.data = n;
            this.left = this.right = null;
        }
    }
    
    
    Node root ;
    Queue<Node> queue = new LinkedList<>();
    
    BinaryTreeCreation(int value){
        root = new Node(value);
        queue.add(root);
    }
    
    
    
    void add(int value){
        Node curr = queue.peek();
        if(curr.left==null) {
            curr.left = new Node(value);
            System.out.println(value+" added to left of "+curr.data);
            queue.add(curr.left);
        }
        else if(curr.right==null){
            curr.right = new Node(value);
            System.out.println(value+" added to right of "+curr.data);
            queue.add(curr.right);
            queue.remove();
        }   
    }
    public static void main(String[] args) {

        BinaryTreeCreation tree = new BinaryTreeCreation(13);
        tree.add(12);
        tree.add(10);
        tree.add(4);
        tree.add(19);
        tree.add(16);
        tree.add(9);
    }    
}
