package com.leetcode.FindtheIndexoftheFirstOccurrenceinaString28;
/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/

import java.util.Arrays;

class Solution {
    public int strStr(String haystack, String needle) {
        char[] charhaystack = haystack.toCharArray();
        char[] charneedle = needle.toCharArray();
        char[] testchar;
        if (Arrays.equals(charhaystack, charneedle)) {
            return 0;
        }
        for (int i = 0; i < charhaystack.length; i++) {
            if (i + charneedle.length > charhaystack.length - 1) {
                System.out.println("too long");
                return -1;
            } else {
                testchar = Arrays.copyOfRange(charhaystack, i, charneedle.length);
                System.out.println(testchar);
                if (Arrays.equals(testchar, charneedle)) {
                    return i;
                }
            }

        }
        return -1;
    }

}

/*
 * 使用函數方法解答
 * class Solution {
 * public int strStr(String haystack, String needle) {
 * if(haystack.contains(needle)){
 * return haystack.indexOf(needle);
 * }
 * return -1;
 * }
 * }
 */

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.strStr("hello", "ll");
        System.out.println(ans);
    }
}
