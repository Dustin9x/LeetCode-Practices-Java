public class _13_RomanToInteger {
    public static int convert(char x){
        int result =0;
        switch (x) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                result = 0;
        }
        return result;
    }

    public static int romanToInt(String s) {
        int res = 0;
        int n = s.length()-1;
        for (int i = 0; i < n ; i++) {
            int x = convert(s.charAt(i));
            if(x < convert(s.charAt(i+1))){
                x=-x;
            }
            res+=x;
        }
        return res + convert(s.charAt(n));
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
