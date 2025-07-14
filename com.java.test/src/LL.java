// public class LL {
//     Node head;

//     class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     //add element first and last

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//     }

//     // Print a list
//     public void printList(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + " --> ");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }
    
//     // Delete element in list
//     public void deleteFirst(){
//         if(head == null){
//             System.out.println("Can't delete list is empty");
//             return;
//         }
//         head = head.next;
//     }

//     public void deleteLast(){
//         if(head == null){
//             System.out.println("Can't delete list is empty");
//             return;
//         }
//         if(head.next == null){
//             head = null;
//             return;
//         }
//         Node secondLast = head;
//         Node lastNode = head.next;
//         while(lastNode.next != null){
//             secondLast = secondLast.next;
//             lastNode = lastNode.next;
//         }
//         secondLast.next = null;
//     }
//     public static void main(String[] args) {
//         LL list = new LL();
//         list.addFirst("is");
//         list.addFirst("name");
//         list.addFirst("My");
//         list.addLast("Avinash");
//         list.printList();
//         list.deleteFirst();
//         list.printList();
//         list.deleteLast();
//         list.printList();
//     }
// }


// USING COLLECTIONS FRAMEWORK

import java.util.LinkedList;

public class LL{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        System.out.println(list);
        list.add("list");
        list.addFirst("this");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.add(3, "null");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
    }
}