package com.leetcode.RomantoInteger13;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Code
 * Testcase
 * Testcase
 * Test Result
 * 13. Roman to Integer
 * Easy
 * Topics
 * Companies
 * Hint
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * Symbol Value
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 * For example, 2 is written as II in Roman numeral, just two ones added
 * together. 12 is written as XII, which is simply X + II. The number 27 is
 * written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There
 * are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * 
 * 
 */

class Solution {
    public int romanToInt(String s) {
        int result;
        char[] sch = s.toCharArray();
        HashMap<String, Integer> hmap = new HashMap<>(
                Map.of("I", 0, "V", 0, "X", 0, "L", 0, "C", 0, "D", 0, "M", 0,
                        "IV", 0, "IX", 0, "XL", 0));
        hmap.put("XC", 0);
        hmap.put("CD", 0);
        hmap.put("CM", 0);
        for (int i = 0; i < sch.length; i++) {
            String iStr = Character.toString(sch[i]);
            if (i == sch.length - 1) {
                hmap.put(iStr, hmap.get(iStr) + 1);
            } else {
                switch (iStr) {
                    case "I":
                        if (Character.toString(sch[i + 1]).equals("V")) {
                            hmap.put("IV", hmap.get(iStr) + 1);
                            i++;
                        } else if (Character.toString(sch[i + 1]).equals("X")) {
                            hmap.put("IX", hmap.get(iStr) + 1);
                            i++;
                        } else {
                            hmap.put("I", hmap.get(iStr) + 1);
                        }
                        break;
                    case "X":
                        if (Character.toString(sch[i + 1]).equals("L")) {
                            hmap.put("XL", hmap.get(iStr) + 1);
                            i++;
                        } else if (Character.toString(sch[i + 1]).equals("C")) {
                            hmap.put("XC", hmap.get(iStr) + 1);
                            i++;
                        } else {
                            hmap.put("X", hmap.get(iStr) + 1);
                        }
                        break;
                    case "C":
                        if (Character.toString(sch[i + 1]).equals("D")) {
                            hmap.put("CD", hmap.get(iStr) + 1);
                            i++;
                        } else if (Character.toString(sch[i + 1]).equals("M")) {
                            hmap.put("CM", hmap.get(iStr) + 1);
                            i++;
                        } else {
                            hmap.put("C", hmap.get(iStr) + 1);
                        }
                        break;

                    default:
                        hmap.put(iStr, hmap.get(iStr) + 1);
                }
            }
        }

        result = hmap.get("I") + hmap.get("V") * 5 + hmap.get("X") * 10 + hmap.get("L") * 50 + hmap.get("C") * 100
                + hmap.get("D") * 500 + hmap.get("M") * 1000 + hmap.get("IV") * 4 + hmap.get("IX") * 9 +
                hmap.get("XL") * 40 + hmap.get("XC") * 90 + hmap.get("CD") * 400 + hmap.get("CM") * 900;
        for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        return result;

    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("MCMXCIV"));

    }
}
