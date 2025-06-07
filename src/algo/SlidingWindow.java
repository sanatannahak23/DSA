package algo;

public class SlidingWindow {

    public static int window(int[] arr, int w) {
        int cur = 0;
        for (int i = 0; i < w; i++) {
            cur += arr[i];
        }

        int max = cur;
        int n = arr.length;
        int t = w;

        for (int i = 1; i <= n - w; i++) {
            cur = cur - arr[i - 1] + arr[t++];
            max = Math.max(max, cur);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 5, 7, 6, 12};
        System.out.println(window(arr, 4));
    }
}
