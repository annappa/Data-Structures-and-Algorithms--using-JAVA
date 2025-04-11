package com.kscm.search.bfs_dfs;

public class MyBinaryNodeP1 {
    private int value;
    private MyBinaryNodeP1 left;
    private MyBinaryNodeP1 right;

    public MyBinaryNodeP1(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyBinaryNodeP1 getLeft() {
        return left;
    }

    public void setLeft(MyBinaryNodeP1 left) {
        this.left = left;
    }

    public MyBinaryNodeP1 getRight() {
        return right;
    }

    public void setRight(MyBinaryNodeP1 right) {
        this.right = right;
    }
}
