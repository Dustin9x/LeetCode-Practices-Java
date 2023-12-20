public class _11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int output = 0;
        while (i < j) {
            output = Math.max(output, (j - i)*(Math.min(height[i], height[j])));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        System.out.println(maxArea(height));
    }
}
