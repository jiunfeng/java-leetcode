package com.leetcode.PlusOne66;
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.


 */

import java.util.Arrays;

import javax.lang.model.type.ArrayType;

class Solution {
    public int[] plusOne(int[] digits) {

        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 10;
                if (i != 0) {
                    digits[i - 1] = digits[i - 1] + 1;
                }

                if (digits[0] == 0) {
                    int[] digitsAdd = new int[digits.length + 1];
                    digitsAdd[0] = 1;
                    System.arraycopy(digits, 0, digitsAdd, 1, digits.length);
                    return digitsAdd;
                }
            }
        }
        return digits;
    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] solList = sol.plusOne(new int[] { 9, 9, 9, 9 });
        System.out.println(Arrays.toString(solList));
    }
}
