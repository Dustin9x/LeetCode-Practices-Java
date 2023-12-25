public class _125_ValidPalindrome {

    public static boolean isValid(char c){
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57);
    }

    public static char convert(char c){
        if(c>=97) c-=32;
        return c;
    }
    public static boolean isPalindrome(String s) {
        if(s.length() <=1) return true;
        int i=0, j=s.length()-1;

        while (i<=j){
            char a = convert(s.charAt(i));
            char b = convert(s.charAt(j));
            if(!isValid(a)){
                i++;
                continue;
            }
            if(!isValid(b)){
                j--;
                continue;
            }
            if(a!=b){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
