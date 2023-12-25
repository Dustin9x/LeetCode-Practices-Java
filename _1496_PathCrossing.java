import java.util.*;

public class _1496_PathCrossing {
    public static boolean isPathCrossing(String path) {
        Set<List<Integer>> visited = new HashSet<>();
        visited.add(Arrays.asList(0,0));
        int x = 0, y = 0;
        for (char c: path.toCharArray()) {
            if(c == 'N') y++;
            if(c == 'E') x++;
            if(c == 'S') y--;
            if(c == 'W') x--;

            if(visited.contains(Arrays.asList(x,y))){
                return true;
            }else{
                visited.add(Arrays.asList(x,y));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String path ="NESW";
        System.out.println(isPathCrossing(path));
    }
}
