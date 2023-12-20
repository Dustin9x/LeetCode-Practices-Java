import javax.swing.plaf.IconUIResource;

public class _1071_GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }else{
            int gc = greatestCommon(str1,str2);
            if(str1.substring(0,gc).equals(str2.substring(0,gc))){
                return str1.substring(0,gc);
            }else{
                return gcdOfStrings(str1.substring(0,gc),str2.substring(0,gc));
            }
        }
    }

    public static int greatestCommon(String str1, String str2){
        int a = str1.length();
        int b = str2.length();
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABCABCABC";
        System.out.println(gcdOfStrings(str1,str2));
    }
}
