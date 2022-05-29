package Trees;
public class BSTCreation {
    class Node{
        int data;
        Node left, right;

        Node(int n){
            this.data = n;
            this.left = this.right = null;
        }
    }

    Node root ;
    BSTCreation(int value){
        root = new Node(value);
    }

   void add(Node node, int value){
        if(value<node.data){
            if(node.left==null){
                node.left = new Node(value);
                System.out.println(value+" added to left of "+node.data);
            }
            else
                add(node.left,value);
        }
        else if(value>node.data){
            if(node.right==null){
                node.right = new Node(value);
                System.out.println(value+" added to right of "+node.data);
            }
            else
                add(node.right,value);
        }
        
    }
    public static void main(String[] args) {
        
        BSTCreation tree = new BSTCreation(13);
        tree.add(tree.root, 12);
        tree.add(tree.root, 10);
        tree.add(tree.root, 4);
        tree.add(tree.root,19);
        tree.add(tree.root, 16);
        tree.add(tree.root, 9);

    }    
}
