public class _1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static int maxVowels(String s, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int result = count;
        for (int i = k; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            result = Math.max(result,count);
        }
        return result;
    }

    public static boolean isVowel(char a){
        return a=='a'||a=='e'||a=='i'||a=='o'||a=='u';
    }

    public static void main(String[] args) {
        String s = "weallloveyou";
        System.out.println(maxVowels(s,7));
    }
}
