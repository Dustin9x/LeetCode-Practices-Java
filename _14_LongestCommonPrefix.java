import java.util.Arrays;

public class _14_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(res) < 0){
                res = res.substring(0,res.length()-1);
            }
            if(res.isEmpty()){
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"fwer","flow","flowght"};
        System.out.println(longestCommonPrefix(strs));
    }
}
