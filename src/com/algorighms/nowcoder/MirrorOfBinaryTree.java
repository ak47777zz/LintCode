package com.algorighms.nowcoder;


/**
 * 二叉树的镜像
 */
public class MirrorOfBinaryTree {

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if ((root.left == null) && (root.right == null)) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
