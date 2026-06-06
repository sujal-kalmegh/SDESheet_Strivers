public class MaximumSubarray {
    public static int maxSubarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i : arr) {
            curr += i;
            max = Math.max(max, curr);
            if (curr < 0) {
                curr = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubarray(arr));
    }
}
