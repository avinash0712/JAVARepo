import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Stackclass {
////////////////////////////////////////////////////////////////////////////////
///////////////////////// Using linked List/////////////////////////////////////    
////////////////////////////////////////////////////////////////////////////////    

    // static class Node{
    //     int data;
    //     Node next;

    //     public Node(int data){
    //         this.data = data;
    //         next = null;
    //     }
    // }
    // static class Stack{
    //     public static Node head;
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }
    //     public static void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;    
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return head.data;
    //     }
    //     public static void printStack(){
    //         if(head == null){
    //             System.out.println("Stack is empty");
    //         }
    //         Node currNode = head;
    //         while(currNode != null){
    //             System.err.print(currNode.data + " -->");
    //             currNode = currNode.next;
    //         }
    //         System.err.println();
    //     }
    // }

/////////////////////////////////////////////////////////////////////////////////
///////////////////////// Using Array List//////////////////////////////////////    
////////////////////////////////////////////////////////////////////////////////

    // static class Stack{
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty(){
    //         return list.size() == 0;
    //     }
    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     public static int pop(){
    //         if(list.isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     public static int peek(){
    //         if(list.isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    //     public static void printStack(){
    //         for(int i=0;i<list.size();i++){
    //             System.out.println(list.get(list.size()-1-i));
    //         }
    //     }
    // }

    public static void main(String[] args) {
        //Stack s = new Stack();

///////////////////////////////////////////////////////////////////////////
/////////////////////Using Collection FrameWork/////////////////////////////
///////////////////////////////////////////////////////////////////////////
        Stack<Integer> s = new Stack<>();
        Random rand = new Random();
        s.push(rand.nextInt(50));
        s.push(rand.nextInt(50));
        s.push(rand.nextInt(50));
        s.push(rand.nextInt(50));
        s.push(rand.nextInt(50));
        s.push(rand.nextInt(50));
        //s.printStack();
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
