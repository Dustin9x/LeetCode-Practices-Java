public class _1768_MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            res.append(word1.charAt(i));
            i++;
            res.append(word2.charAt(j));
            j++;
        }
        while(i<word1.length()){
            res.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            res.append(word2.charAt(j));
            j++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2= "pqrs";
        System.out.println(mergeAlternately(word1,word2));
    }
}
