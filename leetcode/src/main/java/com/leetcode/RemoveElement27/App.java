package com.leetcode.RemoveElement27;
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int numsIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int nowNums = nums[i];
            nums[i] = 0;
            if (nowNums != val) {
                nums[numsIndex] = nowNums;
                numsIndex++;
            }
        }

        return numsIndex;

    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = sol.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);
        System.out.println(k);
    }
}
