package com.algorighms.nowcoder;

/**
 * 链表中倒数第k个结点
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            if (fast == null)
                return null;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
