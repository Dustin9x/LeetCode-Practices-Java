import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _1046_LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }
        while (maxHeap.size() > 1){
            int maxStone = maxHeap.poll();
            int secondStone = maxHeap.poll();
            if (maxStone >= secondStone){
                maxHeap.add(maxStone - secondStone);
            }else{
                maxHeap.add(secondStone);
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] stones = {2,2};
        System.out.println(lastStoneWeight(stones));
    }
}
