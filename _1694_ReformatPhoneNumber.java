public class _1694_ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        number = number.replaceAll("[ -]","");
        return number;
    }

    public static String F(String s){
        int n = s.length();
        if (n == 2 || n == 3) return s;
        if (n == 4) return s.substring(0,2) +"-"+s.substring(2);

        return s.substring(0,3)+"-"+ F(s.substring(3));
    }

    public static void main(String[] args) {
        String number = "1-234-567";
        String s = reformatNumber(number);
        System.out.println(s);
        System.out.println(F(s));
    }

}
