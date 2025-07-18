import java.util.Stack;

public class ProblemsOnStack {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        //Stack<Integer> s1 = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //pushAtBottom(5, s);
        reverseStack(s);
//////////////////////////////////////////////////////////////
///////////////Reverse Stack using another stack//////////////
/////////////////////////////////////////////////////////////
        // while (!s.isEmpty()) {
        //     s1.push(s.peek());
        //     s.pop();
        // }
        // while (!s1.isEmpty()) {
        //     System.out.println(s1.peek());
        //     s1.pop();
        // }
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
