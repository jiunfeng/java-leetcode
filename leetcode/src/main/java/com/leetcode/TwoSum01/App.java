package com.leetcode.TwoSum01;

/**
 * Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and
 * you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class App {

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];

            for (int i = 0; i < nums.length; i++) {

                System.out.printf("目前第一層是%d%n", nums[i]);
                for (int j = i + 1; j < nums.length; j++) {
                    int a = target - nums[i];
                    System.out.println(a);
                    if (target - nums[i] == nums[j]) {

                        ans[0] = i;
                        ans[1] = j;
                        return ans;
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 7 };
        Solution solution = new Solution();
        int[] ans = solution.twoSum(nums, 5);
        System.out.printf("The ans are[%d,%d]", ans[0], ans[1]);
    }
}
