package com.algorighms.lintcode;

/**
 * 将两个排序链表合并为一个新的排序链表
 */
public class LintCode165 {

    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        //先确定新的头节点
        ListNode newHead = null;
        ListNode tmp = null;
        if (l1.val < l2.val) {
            newHead = l1;
            l1 = l1.next;
        } else {
            newHead = l2;
            l2 = l2.next;
        }
        tmp = newHead;
        //比较两条链表头节点
        while ((l1 != null) && (l2 != null)) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
        }
        //一条出现null，处理剩下链表的节点
        if (l1 == null) {
            tmp.next = l2;
        } else {
            tmp.next = l1;
        }
        return newHead;
    }

    /*java非递归版的来了
    public class Solution {
        public ListNode Merge(ListNode list1,ListNode list2) {
            if (list1 ==null)
                return list2;
            if (list2 ==null)
                return list1;
            ListNode head = null;
            ListNode tmp= null;
            if (list1.val < list2.val)
            {
                head = list1;
                list1 = list1.next;
            }
            else
            {
                head = list2;
                list2 = list2.next;
            }
            tmp = head;
            while (list1 != null && list2 != null)
            {
                if (list1.val < list2.val)
                {

                    tmp.next = list1;
                    list1 = list1.next;
                    tmp = tmp.next;

                }
                else
                {
                    tmp.next = list2;
                    list2 = list2.next;
                    tmp = tmp.next;
                }
            }

            while (list1 != null || list2 != null)
            {
                if (list1 ==null && list2 != null)
                {
                    tmp.next = list2;
                    list2 = list2.next;
                    tmp = tmp.next;
                }

                if (list2 ==null && list1 != null)
                {
                    tmp.next = list1;
                    list1 = list1.next;
                    tmp = tmp.next;
                }
            }
            return head;

        }
    }*/
}
