package com.algorighms.lintcode;

/**
 * 给定一个单链表中的表头和一个等待被删除的节点(非表头或表尾)。
 * 请在在O(1)时间复杂度删除该链表节点。并在删除该节点后，返回表头。
 */
public class LintCode372 {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public static void deleteNode(ListNode node) {
        if (node == null) return;
        if (node.next == null) {
            node = null;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
