package com.algorighms.nowcoder;

/**
 * 输入两颗二叉树A，B，判断B是不是A的子结构。
 */
public class SubstructureInTree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            //如果根节点相等，则判断余下子节点。
            if (root1.val == root2.val) {
                result = isHaveTreeB(root1, root2);
            }
            //不相等，递归遍历左子树
            if (!result) {
                result = HasSubtree(root1.left, root2);
            }
            //不相等，递归遍历右子树
            if (!result) {
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;
    }

    public boolean isHaveTreeB(TreeNode atree, TreeNode btree) {
        if (btree == null) {
            return true;
        }
        if (atree == null) {
            return false;
        }
        if (atree.val != btree.val) {
            return false;
        }
        boolean left = isHaveTreeB(atree.left, btree.left);
        boolean right = isHaveTreeB(atree.right, btree.right);
        return left && right;
    }
}
