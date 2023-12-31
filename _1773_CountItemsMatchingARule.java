import java.util.List;
import java.util.Objects;

public class _1773_CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;

        for (int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                res++;
            }else if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                res++;
            }else if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }
}
