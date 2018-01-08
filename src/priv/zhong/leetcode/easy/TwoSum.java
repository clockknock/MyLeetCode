package priv.zhong.leetcode.easy;

import org.junit.Test;

/**
 * @author 钟未鸣
 * @date 2017/12/30
 */
class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[]{i,j};
                }
            }
        }
        throw new RuntimeException("没找到");
    }
}
