public class _1221_SplitAStringInBalancedStrings {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int[] check = new int[2];
        for (char c: s.toCharArray()) {
            if(c == 'R') check[0]++;
            if(c == 'L') check[1]++;
            if(check[0] == check[1]){
                count++;
                check[0] = 0;
                check[1] = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "LLLLRRRR";
        System.out.println(balancedStringSplit(s));
    }
}
