import java.util.Arrays;

public class _1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int count = 0;
        int n = heights.length;
        int sort[] = new int[n];

        for (int i = 0; i < n; i++) {
            sort[i] = heights[i];
        }

        for (int i = 1; i < n; ++i) {
            int key = heights[i];
            int j = i - 1;

            while (j >= 0 && heights[j] > key) {
                heights[j + 1] = heights[j];
                j = j - 1;
            }
            heights[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            if(sort[i] != heights[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        System.out.println(heightChecker(arr));
    }
}
