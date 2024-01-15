package com.leetcode.ValidParentheses20;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
            } else {
                // 遇到右閉但堆疊為空無法匹配括號
                if (stk.isEmpty()) {
                    return false;
                }
                char stkp = stk.pop();
                // 遇到右閉但最後一個左閉不匹配
                if ((c == '}' && stkp != '{') || (c == ')' && stkp != '(') || (c == ']' && stkp != '[')) {
                    return false;
                }
            }
        }
        if (stk.isEmpty()) {
            return true;
        } else
            return false;
    }
}

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isValid("{}()"));

    }

}
