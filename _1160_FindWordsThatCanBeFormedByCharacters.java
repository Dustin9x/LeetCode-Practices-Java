import java.util.Arrays;

public class _1160_FindWordsThatCanBeFormedByCharacters {
    public static int countCharacters(String[] words, String chars) {
        int res = 0;
        for (String word: words) {
            if (word.length() > chars.length()){
                continue;
            }else{
                String newchart = chars;
                boolean isCorrect = true;
                for (int i = 0; i < word.length(); i++) {
                    int index = newchart.indexOf(word.charAt(i));
                    if(index < 0){
                        isCorrect = false;
                        break;
                    }
                    newchart = newchart.substring(0, index) + newchart.substring(index+1);
                }
                if(isCorrect){
                    res += word.length();
                }
            }
        }
        return res;
    }

    public static int countCharacters2(String[] words, String chars) {
        int[] letter = new int[26];
        for (char c: chars.toCharArray()) {
            letter[c-'a']++;
        }
        int res = 0;
        for (String word: words) {
            if(check(word,letter)) res += word.length();
        }
        return res;
    }

    public static boolean check(String word, int[]letter){
        int[] letters = letter.clone();
        for (char c: word.toCharArray()) {
            if (letters[c-'a'] == 0) {
                return false;
            }
            letters[c-'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {
                "wxeyzrnbhlhwxecrgejsrawyulynvgtszwqqlihkcvckgcgtgpyqtkuwvjywmhpskaiwmpyarftqhnogxpith","vdpbykqlihtpvfnqbrcjpggojqbalerohyitktuikbffvfatcnneuvbanjihiaorrjcdthntnrxebfhvshmpodmzhtwnasbm","wgjstkoaojcesfdrllugmojwdmgeejyiqvshlowtktddattunarnohgvqsoskfmbrami","ecwqxbawirvnxvsjybbebclaturorlcbpf","gtjbaigvufrotlwfoqqolnjabnvtbcygtfcytinzpcjbvprdkdjawrcbthmxjrabimhhs","cvzlbrvppkyxtjxzeglzwoagmpjnfxddbwolxmwdohgtfktgftzzkwpianslkpldyfzubtjczse","neaw","mxhmvkajofnmdiiduactlemcvpztscmsnrdhuhquxnnzywsrzxyplgbppiypxwcfbsnyzblaeifo","krekecabfpufucjhqphjnibaeqdvdpmrfougdwugvoioqangdnxromwlxnfeydaneyazzclscqgdxlhhgnoqmslfflzqv","klutvchxsceihfmzitgqakytesfjykribjhjzdruuoycjkwaghmmqkfrhkrtawudtjyjwqbyspamlegqjlwlj","raykfkflqdzrpthdejetwolgciygwaktulkxemkdbbllkjxhnnafsms","os"
        };
        String chars = "figspbov";

        String[] words1 = {"cat","bt","hat","tree"};
        String chars1 = "atach";

        System.out.println(countCharacters2(words,chars));
    }
}
