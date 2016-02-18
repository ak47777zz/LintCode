package com.algorighms.lintcode;

/**
 * Created by sunao on 2016/2/18.
 */
public class LintCode380 {

    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = getLength(headA);
        int bLength = getLength(headB);
        int abs = Math.abs(aLength - bLength);
        //移动指针到相应的位置
        if (aLength >= bLength) {
            headA = movePointer(headA, abs);
        } else {
            headB = movePointer(headB, abs);
        }
        //进行判断
        while (headA != null && headB != null) {
            if (headA.val == headB.val) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    private ListNode movePointer(ListNode head, int abs) {
        for (int i = 0; i < abs; i++) {
            head = head.next;
        }
        return head;
    }

    public static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

}
