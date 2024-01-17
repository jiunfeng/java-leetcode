package com.leetcode.AddBinary67;

import java.math.BigInteger;
import java.util.Arrays;

/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */
class Solution {
    public String addBinary(String a, String b) {
        BigInteger aB = new BigInteger(a, 2);
        BigInteger bB = new BigInteger(b, 2);

        return aB.add(bB).toString(2);
    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String solStr = sol.addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(solStr);
    }
}
