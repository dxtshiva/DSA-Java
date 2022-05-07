public class CircularDoublyList {
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int n){
            this.data = n;
            this.prev = null;
            this.next = null;
        }
    }
        Node head = null;
        Node tail = null;
        void add(int n){
            Node node = new Node(n);
            if(head==null){
                head = node;
                tail = node;
                head.prev = null;
                head.next =  null;
            }
            else{
                node.prev=tail;
                tail.next = node;
                tail = node;
                tail.next = head;
                head.prev= tail;
            }
        }

        void displayFromFront(){
            Node curr = head;
            do{
                System.out.print(curr.data+" ");
                curr = curr.next;
            }while(curr!=head);
            System.out.println();
        }

        void displayFromBack(){
            Node curr = tail;
            do{
                System.out.print(curr.data+" ");
                curr = curr.prev;
            }while(curr!=tail);
            System.out.println();
        }

        void deleteHead(){
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }

        void deleteTail(){
            tail = tail.prev;
            tail.next=head;
            head.prev = tail;
        }

        int find(int n){
            int ind = -1;
            Node curr = head;
            int i;
            for(i=0;curr.data!=n;i++){
                curr = curr.next;
            }

            if(curr.data==n){
                ind = i;
                
            }
            return ind;
        }

    void deleteNode(int n){
        Node curr = head;
        int index = find(n);
        if(index==-1)
            System.out.println("Given node is not present in the list.");
        else{
            for(int i =0;i<index;i++)
                curr = curr.next;
            
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev; 
        }
            
    }
    
    public static void main(String[] args) {
        CircularDoublyList list = new CircularDoublyList();
        for(int i=1;i<=20;i++)
        list.add(i);
        
        list.displayFromFront();
        list.displayFromBack();
        list.deleteHead();
        list.displayFromFront();
        System.out.println(list.find(4));
        list.deleteNode(4);
        list.displayFromFront  ();
        list.deleteTail();
        list.displayFromFront();
    }
}
