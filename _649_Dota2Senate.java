import java.util.LinkedList;
import java.util.Queue;

public class _649_Dota2Senate {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> ra = new LinkedList<>();
        Queue<Integer> di = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if(senate.charAt(i) == 'R'){
                ra.add(i);
            }else{
                di.add(i);
            }
        }

        while(!ra.isEmpty() && !di.isEmpty()){
            if(ra.peek() < di.peek()){
                ra.add(n++);
            }else{
                di.add(n++);
            }
            ra.poll();
            di.poll();
        }

        return ra.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        String s = "RDD";
        System.out.println(predictPartyVictory(s));
    }
}
