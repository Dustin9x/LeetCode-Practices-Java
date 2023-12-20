package Study.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapInJava {
    public static class Student implements Comparable{
        public int age;
        public String name;
        public Student(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            Student other = (Student) o;
            return Integer.compare(this.age,other.age);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(100);
        minHeap.add(20);
        minHeap.add(3);
        minHeap.add(3);
        minHeap.add(2);

        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(100);
        maxHeap.add(20);
        maxHeap.add(3);
        maxHeap.add(3);
        maxHeap.add(2);

        Queue<Student> stdMinHeap = new PriorityQueue<>();
        stdMinHeap.add(new Student(10,"A"));
        stdMinHeap.add(new Student(6,"B"));
        stdMinHeap.add(new Student(8,"C"));

        while (!stdMinHeap.isEmpty()){
            Student youngestStudent = stdMinHeap.poll();
            System.out.println(youngestStudent.age + " " + youngestStudent.name);
        }
    }
}
