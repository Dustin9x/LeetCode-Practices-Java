public class _443_StringCompression {
    public static int compress(char[] chars) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        res.append(chars[0]);
        for (int i = 0, j = 1; i<chars.length && j < chars.length; j++) {
            if(chars[i] == chars[j]){
                count++;
            }else{
                if(count >1 ) res.append(count);
                res.append(chars[j]);
                count = 1;
                i=j;
            }
        }
        if(count >1 ) res.append(count);
        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }
        return res.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] chars2 = {'a','a','b','b','b','c','c'};
        char[] chars3 = {'a'};
        System.out.println(compress(chars2));
    }
}
