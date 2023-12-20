public class _28_FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int h = haystack.length(), n = needle.length();
        int left = 0, right = 0, index=0;
        if (h < n) return -1;
        while (left < h) {
            if (haystack.charAt(left) == needle.charAt(right)) {
                if (right == needle.length() - 1) {
                    return left - right;  // Found the entire needle in haystack.
                }
                left++;
                right++;
            } else {
                left = left + 1;  // Bat dau kiem tra lai tu dau nhung o vi tri tiep theo
                right = 0;          // Reset needle index.
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sdsaddddbutssdad", needle = "sadd";
        System.out.println(strStr(haystack,needle));
    }
}
