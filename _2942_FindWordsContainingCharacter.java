import java.util.ArrayList;
import java.util.List;

public class _2942_FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) >= 0){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'z';
        System.out.println(findWordsContaining(words,x));;
    }
}
