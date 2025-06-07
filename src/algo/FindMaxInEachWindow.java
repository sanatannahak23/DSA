package algo;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxInEachWindow {

    public static int[] findMax(int[] nums, int k) {
        int t = k;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            int max = Arrays.stream(Arrays.copyOfRange(nums, i, t++))
                    .max().orElse(Integer.MAX_VALUE);

            list.add(max);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] max = findMax(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(max));
    }
}
