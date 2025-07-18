public class QueueClass {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        //enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        //dequeue
        public static int remove(){
            if(Queue.isEmpty()){
                System.out.println("No element present in the queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if(Queue.isEmpty()){
                System.out.println("No element present in the queue");
                return -1;
            }
            return arr[0];
        }
    }
    static class CircularQueue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        CircularQueue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class QueueUsingLinkedList{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }    
    public static void main(String[] args) {
        // Queue q = new Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }
        // CircularQueue cq = new CircularQueue(5);
        // cq.add(1);
        // cq.add(2);
        // cq.add(3);
        // cq.add(4);
        // cq.add(5);
        // cq.remove();
        // cq.add(6);
        // while(!cq.isEmpty()){
        //     System.out.println(cq.peek());
        //     cq.remove();
        // }
        QueueUsingLinkedList ql = new QueueUsingLinkedList();
        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(4);
        ql.add(5);
        ql.add(6);
        while(!ql.isEmpty()){
            System.out.println(ql.peek());
            ql.remove();
        }
        ql.add(7);
        System.out.println(ql.remove());
        System.out.println(ql.remove());
    }
}
