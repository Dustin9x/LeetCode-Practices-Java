public class _2744_FindMaximumNumberOfStringPairs {
    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].charAt(1) == words[j].charAt(0) && words[i].charAt(0) == words[j].charAt(1)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"ku","dd","gu","uk"};
        System.out.println(maximumNumberOfStringPairs(words));
    }
}
