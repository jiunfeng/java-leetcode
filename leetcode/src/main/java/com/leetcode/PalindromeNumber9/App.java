package com.leetcode.PalindromeNumber9;

/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.
 */
class Solution {
    public boolean isPalindrome(int x) {
        String xStr = Integer.toString(x);
        char[] xch = xStr.toCharArray();
        char[] xchreverse = new StringBuilder(xStr).reverse().toString().toCharArray();

        for (int i = 0; i < xch.length; i++) {
            if (xch[i] != xchreverse[i])
                return false;

        }
        return true;
    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(121));
    }
}
