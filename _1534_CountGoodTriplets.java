public class _1534_CountGoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a){
                    for (int k = j+1; k < arr.length; k++) {
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println(countGoodTriplets(arr,0,0,1));
    }
}
