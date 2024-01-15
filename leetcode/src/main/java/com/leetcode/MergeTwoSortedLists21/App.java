package com.leetcode.MergeTwoSortedLists21;

/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        while (list1 != null) {
            while (list2 != null) {
                if (list1.val >= list2.val) {
                    ListNode add = new ListNode(list2.val);
                    result = add;
                    result = result.next;
                }
                list2 = list2.next;
            }
        }
        return list1;
    }
}

public class App {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution sol = new Solution();
        sol.mergeTwoLists(head1, head2);
        printLinkedList(head2);
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(); // 换行
    }
}
