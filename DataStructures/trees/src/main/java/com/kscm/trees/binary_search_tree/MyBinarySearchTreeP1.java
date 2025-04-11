package com.kscm.trees.binary_search_tree;

public class MyBinarySearchTreeP1 {
    private MyBinaryTreeNodeP1 root;

    public MyBinarySearchTreeP1() {
        this.root = null;
    }

    public MyBinaryTreeNodeP1 lookup(int val) {
        if(root == null) {
            return null;
        }

        MyBinaryTreeNodeP1 currNode = root;

        while(currNode != null) {
            if(val < currNode.getValue()) {
                currNode = currNode.getLeft();
            } else if (val > currNode.getValue()) {
                currNode = currNode.getRight();
            } else {
                return currNode;
            }
        }
        return null;
    }

    public void insert(int value) {
        if(root == null) {
            this.root = new MyBinaryTreeNodeP1(value);
            return;
        }
        MyBinaryTreeNodeP1 curr = root;
        while(true) {
            if(curr.getValue() > value) {
                if(curr.getLeft() == null) {
                    curr.setLeft(new MyBinaryTreeNodeP1(value));
                    return;
                }
                curr = curr.getLeft();
            } else {
                if(curr.getRight() == null) {
                    curr.setRight(new MyBinaryTreeNodeP1(value));
                    return;
                }
                curr = curr.getRight();
            }
        }
    }

    public void printTree() {
        printTree(root);
    }

    public void printTree(MyBinaryTreeNodeP1 curr) {
        System.out.println(curr.getValue());
        if(curr.getLeft() != null) {
            printTree(curr.getLeft());
        }
        if(curr.getRight() != null) {
            printTree(curr.getRight());
        }
    }

    public static void main(String[] args) {
        MyBinarySearchTreeP1 tree = new MyBinarySearchTreeP1();
        tree.insert(9);
        tree.insert(4);
        tree.insert(20);
        tree.insert(1);
        tree.insert(6);
        tree.insert(15);
        tree.insert(170);
        tree.printTree();
    }
}
