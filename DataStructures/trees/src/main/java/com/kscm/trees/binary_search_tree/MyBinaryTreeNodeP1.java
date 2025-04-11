package com.kscm.trees.binary_search_tree;

public class MyBinaryTreeNodeP1 {
    private int value;
    private MyBinaryTreeNodeP1 left;
    private MyBinaryTreeNodeP1 right;

    public MyBinaryTreeNodeP1(int value) {
        this.value = value;
        this.left =null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyBinaryTreeNodeP1 getLeft() {
        return left;
    }

    public void setLeft(MyBinaryTreeNodeP1 left) {
        this.left = left;
    }

    public MyBinaryTreeNodeP1 getRight() {
        return right;
    }

    public void setRight(MyBinaryTreeNodeP1 right) {
        this.right = right;
    }
}
