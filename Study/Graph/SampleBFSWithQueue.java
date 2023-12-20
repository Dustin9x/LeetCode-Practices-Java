package Study.Graph;

import java.util.*;

public class SampleBFSWithQueue {
    public static void main(String[] args) {
        int[][] graph = {   {0,1,0,0,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,0,1,0},
                {0,1,0,0,0,1,1},
                {0,1,0,0,0,0,1},
                {0,0,1,1,0,0,0},
                {0,0,0,1,1,0,0} };

        //Khai bao
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> checked = new HashSet<>();

        //Khoi tao
        queue.add(0);
        checked.add(0);

        //Duyet theo stack
        while(!queue.isEmpty()){
            int u = queue.poll();

            //Xu ly dinh u
            System.out.print(u + " ");
            //Add tat ca cac dinh ke v voi u ma chua duoc duyet vao stack
            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && !checked.contains(v)){
                    queue.add(v);
                    checked.add(v);
                }
            }
        }
    }
}
