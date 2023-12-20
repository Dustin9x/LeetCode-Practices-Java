import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1207_UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i: arr ) {
            if(map.containsKey(i) == false){
                map.put(i,1);
            }else{
                int Occur = map.get(i);
                Occur++;
                map.put(i,Occur);
            }
        }
        for(var entry : map.entrySet()){
            if (!set.contains(entry.getValue())) {
                set.add(entry.getValue());
            }else{
                return false;
            }
        }
        return true;
    }

}
