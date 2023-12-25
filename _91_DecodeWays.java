import java.util.Arrays;

public class _91_DecodeWays {

    public static int numDecodings(String s) {
        int[] mem = new int[s.length()];
        Arrays.fill(mem,-1);
        return helper(s, 0, mem);
    }

    public static int helper(String s, int i, int[] mem){
        if(i == s.length()) return 1;
        if(s.charAt(i) == '0') return 0;
        if(mem[i] != -1) return mem[i];

        int count = helper(s,i+1,mem);
        if(i<s.length()-1 && ((s.charAt(i)-'0')*10 + s.charAt(i+1) - '0') < 27){
            count += helper(s,i+2,mem);
        }
        mem[i] = count;
        return mem[i];
    }

    public static void main(String[] args) {
        String s = "2126";
        System.out.println(numDecodings(s));
    }
}
