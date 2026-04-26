
import java.util.*;

public class LC_2035 {

    // soln 1: DP based recursive solution, TLE Leetcode.
    int min = Integer.MAX_VALUE;
    HashSet<String> dp;

    public int minimumDifference(int[] nums) {
        int sum = 0;
        this.dp = new HashSet<>();
        for (int x : nums) {
            sum += x;
        }
        f(0, 0, 0, nums, sum);
        return min;
    }

    public void f(int i, int c, int sum, int[] nums, int total) {
        String key = i + "_" + c + "_" + sum;
        if (dp.contains(key)) {
            return;
        }
        dp.add(key);
        if (c == nums.length / 2) {
            int diff = Math.abs(sum - (total - sum));
            if (diff < min) {
                min = diff;
            }
            return;
        }

        if (i >= nums.length) {
            return;
        }

        f(i + 1, c + 1, sum + nums[i], nums, total);
        f(i + 1, c, sum, nums, total);

    }

    // soln 2 : Meet in the middle.
    public int minimumDifference_meet(int[] nums) {
        int n = nums.length / 2;

        int[] left = Arrays.copyOfRange(nums, 0, n);
        int[] right = Arrays.copyOfRange(nums, n, 2 * n);

        Map<Integer, List<Integer>> leftMap = new HashMap<>();
        Map<Integer, List<Integer>> rightMap = new HashMap<>();

        // Generate subset sums
        generate(left, leftMap);
        generate(right, rightMap);

        // Sort right map lists for binary search
        for (List<Integer> list : rightMap.values()) {
            Collections.sort(list);
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum / 2;
        int res = Integer.MAX_VALUE;

        // Iterate over left map
        for (int size : leftMap.keySet()) {
            List<Integer> leftList = leftMap.get(size);
            List<Integer> rightList = rightMap.get(n - size);

            for (int leftSum : leftList) {
                int remaining = target - leftSum;

                int idx = lowerBound(rightList, remaining);

                // Check idx
                if (idx < rightList.size()) {
                    int sum = leftSum + rightList.get(idx);
                    res = Math.min(res, Math.abs(totalSum - 2 * sum));
                }

                // Check idx - 1
                if (idx > 0) {
                    int sum = leftSum + rightList.get(idx - 1);
                    res = Math.min(res, Math.abs(totalSum - 2 * sum));
                }
            }
        }

        return res;
    }

    // Generate subset sums grouped by size
    private void generate(int[] arr, Map<Integer, List<Integer>> map) {
        int n = arr.length;
        int total = 1 << n;

        for (int mask = 0; mask < total; mask++) {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                    count++;
                }
            }

            map.computeIfAbsent(count, k -> new ArrayList<>()).add(sum);
        }
    }

    // Lower bound (first index >= target)
    private int lowerBound(List<Integer> list, int target) {
        int left = 0, right = list.size();

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
