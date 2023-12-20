public class _605_CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if(n==1 && flowerbed.length == 1 && flowerbed[0] == 0) return true;
        if(n>1 && flowerbed.length <=n) return false;
        while(n>0){
            if(flowerbed[0] == 0 && flowerbed[1] == 0) n--;
            if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0) n--;
            for (int i = 1; i < flowerbed.length-1; i++) {
                if (flowerbed[i] == 0) {
                    count++;
                    if(count == 3) {
                        n--;
                        count-=2;
                    }
                } else {
                    count = 0;
                }
            }
            if (n>0 && count<=2) return false;
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,0,0};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
