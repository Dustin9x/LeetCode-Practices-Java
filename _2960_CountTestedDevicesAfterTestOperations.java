public class _2960_CountTestedDevicesAfterTestOperations {
    public static int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if(batteryPercentages[i] > 0){
                for (int j = i+1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = Math.max(0,batteryPercentages[j]-1);
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] batteryPercentages = {2,1};
        System.out.println(countTestedDevices(batteryPercentages));
    }
}
