package Study.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        for (Integer i : myQueue) {
            System.out.print(i);
        }

        System.out.println("peek: " + myQueue.peek());
        System.out.println("remove: " + myQueue.remove());
        for (Integer i : myQueue) {
            System.out.print(i);
        }
        System.out.println("remove: " + myQueue.remove());
        System.out.println("remove: " + myQueue.remove());
        System.out.println("is empty: " + myQueue.isEmpty());
    }
}
