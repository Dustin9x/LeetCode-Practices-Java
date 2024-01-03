public class _2125_NumberOfLaserBeamsInABank {
    public static int countOne(String s){
        int count = 0;
        for (char c : s.toCharArray()) {
            if(c == '1') count++;
        }
        return count;
    }
    public static int numberOfBeams(String[] bank) {
        int res = 0, prev = 0;
        for (String s: bank) {
            if(countOne(s) > 0) {
                res += prev * countOne(s);
                prev = countOne(s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
}
