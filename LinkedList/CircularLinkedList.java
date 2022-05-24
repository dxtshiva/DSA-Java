
public class CircularLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int num){
            this.val = num;
        }
    }
    Node head  = null;
    Node tail = null;

    public void addNode(int n){
        Node node = new Node(n);
        if(head==null){
            head = node;
            tail = node;
            tail.next= head;
        }
        else{
            tail.next= node;
            tail = node;
            tail.next = head;
        }

        System.out.println("New node added successfully");
    }
    
    void displayNodes(){
        Node curr = head;
        if(head==null)
            System.out.println("No elements in the  list");
        else{
            
            do{
            System.out.print(curr.val+" ");
            curr = curr.next;
            }while(curr!=head);
        }
        System.out.println();
    }

    void deleteFromBegin(){
        Node curr = head.next;
   
        while(curr.next!=head)
            curr = curr.next;
               
        head = head.next;
        curr.next = head;
    }

    void deleteFromEnd(){
        Node prev = head;
        while(prev.next.next!=head)
            prev = prev.next;

        prev.next=head;
        tail = prev;
    }

    int searchElement(int n){
        int ind = -1,cnt = 0;
        Node curr = head;
        do{
            if(curr.val==n){
                ind = cnt;
                break;
            }
            else{
            curr = curr.next;
            cnt++;
            }
        }while(curr!=head);
        return ind;
    }
    public static void main(String args[]) {
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);

        System.out.print("The initial list is: ");
        list.displayNodes();

        list.deleteFromBegin();

        System.out.print("Elements after deletion from beginning are: ");
        list.displayNodes();

        list.deleteFromEnd();

        System.out.print("Elements after deletion from end are: ");
        list.displayNodes();

        System.out.println("Element found at node number: "+list.searchElement(5));
    }
}
