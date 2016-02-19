package com.algorighms.lintcode;

/**
 * Created by sunao on 2016/2/17.
 */
public class OneWayListNodeFactory {

    public static ListNode getListNode(int... args) {
        ListNode pre = null;
        ListNode head = null;
        for (int arg : args) {
            ListNode now = new ListNode(arg);
            if (pre == null) {
                pre = now;
                head = now;
                continue;
            }
            pre.next = now;
            pre = now;
        }
        return head;
    }

    public static void print(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val);
            node = node.next;
        }
        sb.append("null");          //最后一个节点的next为null
        System.out.println(sb);
    }

    public static void main(String[] args) {

        print(getListNode(1));
    }

}

/**
 * 单向链表节点
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
