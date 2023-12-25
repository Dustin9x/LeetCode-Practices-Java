public class _1758_MinimumChangesToMakeAlternatingBinaryString {
    public static int minOperations(String s) {
        int resZero = 0;
        int resOne = 0;
        for (int i=0; i < s.length(); i++) {
            if(i%2==0){
                if(s.charAt(i)!= '0') resZero++;
                else resOne++;
            }else{
                if(s.charAt(i)!= '0') resOne++;
                else resZero++;
            }
        }
        return Math.min(resZero,resOne);
    }

    public static void main(String[] args) {
        String s = "110010";
        System.out.println(minOperations(s));
    }
}
