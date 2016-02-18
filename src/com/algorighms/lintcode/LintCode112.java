package com.algorighms.lintcode;

/**
 * Created by sunao on 2016/2/17.
 */

import static com.algorighms.lintcode.OneWayListNodeFactory.getListNode;
import static com.algorighms.lintcode.OneWayListNodeFactory.print;

public class LintCode112 {
    /**
     * 给出1->1->2->null，返回 1->2->null
     * 给出1->1->2->3->3->null，返回 1->2->3->null
     *
     * @param head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            //相同pre不动，curr后移
            if (pre != null && (pre.val == curr.val)) {
                pre.next = curr.next;
                curr = pre.next;
            }
            //不相同，pre后移，curr后移
            else {
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode list0 = getListNode(14, 14, 13, 13, 13, 13);
        print(deleteDuplicates(list0));

    }

}

