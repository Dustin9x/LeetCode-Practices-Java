public class _2114_MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int res = 0;
        for (String str: sentences) {
            int count = 1;
            for (char c: str.toCharArray()) {
                if(c == ' '){
                    count++;
                }
            }
            res = Math.max(res,count);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
