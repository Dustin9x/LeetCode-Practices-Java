import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1436_DestinationCity {
    public static String destCity(List<List<String>> paths) {
        Set<String> check = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            check.add(paths.get(i).get(0));
        }
        for (int i = 0; i < paths.size(); i++) {
            if(!check.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        String[] s1 = {"B","C"};
        String[] s2 = {"D","B"};
        String[] s3 = {"C","A"};
        paths.add(List.of(s1));
        paths.add(List.of(s2));
        paths.add(List.of(s3));
        System.out.println(destCity(paths));
    }
}
