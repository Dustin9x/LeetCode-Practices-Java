package Study.Stack_Queue;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        //push
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        for (Integer i: myStack) {
            System.out.print(i+" ");
        }

        //pop
        System.out.println("\nPop: " + myStack.pop());
        System.out.println("\nIsEmpty: " + myStack.isEmpty());
        for (Integer i: myStack) {
            System.out.print(i+" ");
        }

        //peek
        System.out.println("\nPeek: " + myStack.peek());
        for (Integer i: myStack) {
            System.out.print(i+" ");
        }
    }
}
