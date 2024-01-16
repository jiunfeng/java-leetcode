package com.leetcode.RemoveDuplicatesfromSortedArray26;
/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
 */

import java.util.TreeMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer, Integer> tMap = new TreeMap<Integer, Integer>();
        for (int i : nums) {
            if (tMap.containsKey(i)) {
                tMap.put(i, tMap.get(i) + 1);
            } else {
                tMap.put(i, 1);
            }
        }
        int n = 0;
        for (int i : tMap.keySet().toArray(new Integer[0])) {
            nums[n] = i;
            n++;
        }

        return tMap.size();
    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int solNum = sol.removeDuplicates(new int[] { 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6 });
        System.out.println("The ans k is:" + solNum);
    }
}
