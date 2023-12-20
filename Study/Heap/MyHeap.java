package Study.Heap;

import java.util.Scanner;

public class MyHeap {
    public static class MinHeap{
        private int MAX_SIZE = 100000;
        private int[] arr = new int[MAX_SIZE+1];
        private int size;

        MinHeap(){
            size=0;
        }

        public boolean isEmpty(){
            return size<=0;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Error: Heap is empty!");
                return -1;
            }
            return arr[1];
        }

        private void swap(int i, int j){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        public void add(int v){
            size++;
            arr[size]=v;
            //heapify up
            int curIndex = size;
            int parentIndex = curIndex/2;
            while (parentIndex != 0 && arr[parentIndex] > arr[curIndex]){
                swap(parentIndex,curIndex);
                curIndex = parentIndex;
                parentIndex = curIndex/2;
            }
        }

        public int poll(){
            if(isEmpty()){
                System.out.println("Error: Heap is empty!");
                return -1;
            }

            int root = arr[1];
            arr[1] = arr[size];
            size--;

            //heapify down
            heapifyDown(1);
            return root;
        }

        private void heapifyDown(int curIndex){
            while((2*curIndex) <= size){
                int leftChildIndex = 2*curIndex;
                int rightChildIndex = leftChildIndex+1;
                int smallerChildIndex = leftChildIndex;
                if(rightChildIndex <= size && arr[rightChildIndex] < arr[leftChildIndex]){
                    smallerChildIndex = rightChildIndex;
                }

                if(arr[curIndex]>arr[smallerChildIndex]){
                    swap(curIndex,smallerChildIndex);
                    curIndex = smallerChildIndex;
                }else{
                    break; //OK
                }
            }
        }

        public void remove(int v){
            int curIndex = -1;
            for (int i = 0; i < size; i++) {
                if(arr[i] == v){
                    curIndex = i;
                    break;
                }
            }
            if(curIndex == -1){
                System.out.println("Error: element is not exist!");
                return;
            }

            arr[curIndex] = arr[size];
            size--;

            heapifyDown(curIndex);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinHeap minHeap = new MinHeap();
        int q =sc.nextInt();
        while (q>0){
            int t = sc.nextInt();
            if(t == 1){ // add
                minHeap.add(sc.nextInt());
            }else if(t == 2){ //remove
                minHeap.remove(sc.nextInt());
            }else{
                System.out.println(minHeap.peek());
            }
            q--;
        }
    }
}
