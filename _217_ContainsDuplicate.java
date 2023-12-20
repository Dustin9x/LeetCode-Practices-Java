import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();

        for (int n: nums) {
            if(mySet.contains(n)){
                return true;
            }
            mySet.add(n);
        }
        return false;
    }
}
