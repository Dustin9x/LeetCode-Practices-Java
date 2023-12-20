package Study.Stack_Queue;

public class MyMain {
    public static void main(String[] args) {
//        MyArrayStack myStack = new MyArrayStack(3);
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.show();
//
//        myStack.pop();
//        myStack.show();
//        myStack.pop();
//        myStack.show();
//        myStack.pop();
//        myStack.show();
//
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//        myStack.show();

//        MyArrayQueue myQueue = new MyArrayQueue(3);
//        myQueue.push(1);
//        myQueue.push(2);
//        myQueue.push(3);
//        myQueue.show();
//
//        myQueue.pop();
//        myQueue.pop();
//        myQueue.pop();
//        myQueue.pop();
//        System.out.println("count: " + myQueue.count());
//        myQueue.show();
//
//        myQueue.push(7);
//        myQueue.push(8);
//        myQueue.show();
//        System.out.println("count: " + myQueue.count());

//        MyLinkedListStack stack = new MyLinkedListStack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.show();
//        System.out.println(stack.pop());
//        stack.show();
//        System.out.println(stack.push(4));
//        System.out.println(stack.pop());
//        stack.show();
//        System.out.println(stack.pop());
//        stack.show();

        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.show();

        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
    }
}
