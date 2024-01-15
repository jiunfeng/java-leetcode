package com.leetcode.LongestCommonPrefix14;
/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < strs[0].length(); i++) {

            for (int j = 0; j < strs.length; j++) {
                // 長度檢查要在前面 || 只要前面的條件評估為 true就不會再檢查後面的 可以避免噴錯超出索引範圍
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {

                    return result;

                }
            }
            result = result + strs[0].charAt(i);
        }
        return result;
    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // String[] strs = { "flower", "flow", "flight" };
        String[] strs = { "ab", "a" };
        System.out.println(sol.longestCommonPrefix(strs));

    }
}
