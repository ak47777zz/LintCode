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

}

