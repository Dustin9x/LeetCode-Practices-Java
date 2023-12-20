public class _771_JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {

        boolean[] check = new boolean[58];
        for (char c : jewels.toCharArray()) {
            check[c - 'A'] = true;
        }
        int count = 0;
        for (char c : stones.toCharArray()) {
            if((check[c - 'A'])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
