package com.algorighms.lintcode;

import java.util.LinkedList;

/**
 * 翻转一个链表
 */
public class LintCode35 {
    /**
     * 使用栈进行翻转
     *
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        LinkedList<ListNode> stack = new LinkedList();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        head = stack.pop();
        ListNode h = head;
        while (!stack.isEmpty()) {
            h.next = stack.pop();
            h = h.next;
        }
        h.next = null;

        return head;
    }

    /**
     * 使用指针翻转
     *
     * @param head
     * @return
     */
    public ListNode reverse1(ListNode head) {
        ListNode reverseHead = null;
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            if (next == null) {
                reverseHead = node;
            }
            node.next = prev;
            prev = node;
            node = next;
        }
        return reverseHead;
    }

}

