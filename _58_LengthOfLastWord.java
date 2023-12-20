public class _58_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int res = 0;
        int n = s.length()-1;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)!=' '){
                break;
            }else{
                n--;
            }
        }
        for (int i = n; i >=0 ; i--) {
            res++;
            if(s.charAt(i)== ' '){
                return res-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "Hello Worlds";
        System.out.println(lengthOfLastWord(s));
    }
}
