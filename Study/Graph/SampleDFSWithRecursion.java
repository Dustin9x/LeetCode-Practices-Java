package Study.Graph;

import java.util.HashSet;
import java.util.Set;

public class SampleDFSWithRecursion {
    public static void DFS(int u, int[][] graph, Set<Integer> checked){
        //proceed u
        System.out.print(u+" ");
        for (int v = graph.length-1; v > 0; v--) {
            if(graph[u][v] == 1 && !checked.contains(v)){
                checked.add(v);
                DFS(v,graph,checked);
            }
        }
    }
    public static void main(String[] args) {
        int[][] graph = {   {0,1,0,0,0,0,0},
                            {1,0,1,1,1,0,0},
                            {0,1,0,0,0,1,0},
                            {0,1,0,0,0,1,1},
                            {0,1,0,0,0,0,1},
                            {0,0,1,1,0,0,0},
                            {0,0,0,1,1,0,0} };

        //
        Set<Integer> checked = new HashSet<>();
        checked.add(0);
        DFS(0,graph,checked);
    }
}
