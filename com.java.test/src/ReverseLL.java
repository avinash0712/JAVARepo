import java.util.Random;

public class ReverseLL {
    Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head; 
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void reverseList(){
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = currNode.next;
        if(head == null || head.next == null){
            System.out.println("");
        }
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;

                // Node currNode = head.next;
        // Node prevNode = head;

        // while(currNode != null){
        //     Node nextNode = currNode.next;
        //     currNode.next = prevNode;
        //     prevNode = currNode;
        //     currNode = nextNode;
        // }
        // head.next = null;
        // head = prevNode;

        
        // Node prev = null;
        // Node current = head;
        // Node next = current.next;

        // while (current != null) {
        //     next = current.next;     
        //     current.next = prev;
        //     prev = current; 
        //     current = next;
        // }

        // head = prev;
    }
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        Random rand = new Random();
        list.printList();
        list.addFirst(rand.nextInt(50));
        list.addFirst(rand.nextInt(50));
        list.addFirst(rand.nextInt(50));
        list.addFirst(rand.nextInt(50));
        list.printList();
        list.addLast(rand.nextInt(10));
        list.addLast(rand.nextInt(10));
        list.printList();
        list.reverseList();
        list.printList();
    }
}
