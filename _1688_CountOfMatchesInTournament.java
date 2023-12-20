public class _1688_CountOfMatchesInTournament {
    public static int numberOfMatches(int n) {
        int output = 0;
        while (n>1){
            if(n%2 ==0){
                n = n/2;
                output+=n;
            }else{
                n = (n-1)/2 + 1;
                output+=n -1;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfMatches(n));
    }
}
