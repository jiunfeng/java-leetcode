package com.leetcode.AddTwoNumbers2;

import java.util.Arrays;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
// class Solution {
// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

// }
// }

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

public class App {
    public static void main(String[] args) {
        // 创建链表: 1 -> 2 -> 3
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode head2 = new ListNode(4, new ListNode(5, new ListNode(6)));
        StringBuilder head1st = new StringBuilder();
        StringBuilder head2st = new StringBuilder();
        int rhead1, rhead2;
        int sum;
        while (head1 != null) {
            head1st.append(head1.val);
            head1 = head1.next;
        }
        rhead1 = Integer.parseInt(head1st.reverse().toString());
        System.out.println(rhead1);

        while (head2 != null) {
            head2st.append(head2.val);
            head2 = head2.next;
        }
        rhead2 = Integer.parseInt(head2st.reverse().toString());
        System.out.println(rhead2);

        sum = rhead1 + rhead2;
        System.out.println(sum);
        StringBuilder sumStr = new StringBuilder(Integer.toString(sum));
        System.out.println(sumStr.reverse());

        ListNode a = new ListNode(Integer.parseInt(sumStr.toString()));
        System.out.println(a.val);
        // System.out.println(head1st);
        // 遍历链表并打印节点值
        // printLinkedList(head);
        // int[] num = { 5, 6, 7 };
        // System.out.println(Arrays.toString(num));
        // String str = "";
        // for (int i : num) {
        // str += i;
        // }
        // System.out.println(num[-1]);

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
