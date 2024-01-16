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
        ListNode head = new ListNode(0);
        ListNode tail = head;
        // 處理兩個node不為空
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                ListNode newAdd = new ListNode(list2.val);
                tail.next = newAdd;
                tail = tail.next;
                list2 = list2.next;
            } else {
                ListNode newAdd = new ListNode(list1.val);
                tail.next = newAdd;
                tail = tail.next;
                list1 = list1.next;
            }
        }
        // 將不為空的剩下那組添加到node尾
        while (list1 != null) {
            ListNode newAdd = new ListNode(list1.val);
            tail.next = newAdd;
            tail = tail.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode newAdd = new ListNode(list2.val);
            tail.next = newAdd;
            tail = tail.next;
            list2 = list2.next;
        }
        ListNode result = head.next;

        return result;
    }
}

public class App {
    public static void main(String[] args) {
        // ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);

        Solution sol = new Solution();

        printLinkedList(sol.mergeTwoLists(head1, head2));
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
