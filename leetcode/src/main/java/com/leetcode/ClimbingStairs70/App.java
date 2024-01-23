package com.leetcode.ClimbingStairs70;
/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

import java.util.ArrayList;

class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer> arrayResult = new ArrayList<Integer>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                arrayResult.add(i + 1);
            } else {
                arrayResult.add(arrayResult.get(i - 1) + arrayResult.get(i - 2));

            }
        }
        System.out.println(arrayResult.get(0));
        System.out.println(arrayResult.get(1));
        System.out.println(arrayResult.get(2));
        System.out.println(arrayResult.get(3));
        System.out.println(arrayResult.get(4));
        result = arrayResult.get(n - 1);
        return result;
    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.climbStairs(8);
        System.out.println(result);
    }

}
