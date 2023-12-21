public class _278_FirstBadVersion {
    static boolean isBadVersion(int version){
        if(version <= 3) {
            return false;
        }else{
            return true;
        }
    }
    public static int firstBadVersion(int n) {
        int i = 1;
        while(i<=n){
            int mid = i + (n-i)/2;
            if(isBadVersion(mid) == true){
                n = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(7));
    }
}
