import java.util.Random;
import java.util.Scanner;

public class ProblemsOnLL {
    Node head;
    public class Node {
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
        head =newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public int size(){
        int size = 0;
        Node currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        return size;
    }
// Q1 ----------- delete nth element form last
    public void deleteNthElementFromEnd(int size, int n ){
        if(head.next == null){
            head = null;
        }
        if(n>size){
            System.out.println("Enter the value less than size of LL");
            return;
        }

        int indexToSearch = size-n-1;
        int indexToDelete = size-n;
        Node currNode = head;
        int i = 0;
        while(i<=indexToSearch){
            currNode = currNode.next;
            i++;
        }
        System.out.println("The value at "+n+"th position from last is :- "+currNode.data);
        if(n==size){
            head = head.next;
        }
        currNode = head;
        int j = 1;
        while(j<indexToDelete){
            currNode = currNode.next;
            j++;
        }
        currNode.next = currNode.next.next;
    }

// Q2 -------Check LL is palindrome---

    public Node reverse(Node head){
        Node currNode = head;
        Node prevNode = null;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null ){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isLLPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node firstHalfEnd = findMiddle(head);
        Node secondHalfStart = reverse(firstHalfEnd.next);
        Node firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

// Q3 ------------ Check if LL has Cycle

    public boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Node turtle = head;
        Node hare = head;

        while(hare.next != null && hare != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        ProblemsOnLL list = new ProblemsOnLL();
        Random rand = new Random();
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.addFirst(rand.nextInt(50));
        // list.printList();
        // System.out.println("Size of list :- "+list.size());
        // System.out.println("Enter the position of element you want to find and delete from last: ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int size = list.size();
        // list.deleteNthElementFromEnd(size, n);
        // list.printList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list.isLLPalindrome(list.head) ? "Linked List is palindrome" : "Linked List is not palindrome");
        System.out.println(list.hasCycle(list.head)? "LL has cycle ":"LL has no cycle");
    }
}
