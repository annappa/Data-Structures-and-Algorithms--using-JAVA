package com.kscm.search.bfs_dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyBinarySearchTreeP1 {
    private MyBinaryNodeP1 root;

    public MyBinarySearchTreeP1() {
        this.root = null;
    }

    public void insert(int value) {
        if(root == null) {
            this.root = new MyBinaryNodeP1(value);
            return;
        }

        MyBinaryNodeP1 currNode = root;
        MyBinaryNodeP1 newNode = new MyBinaryNodeP1(value);
        while(true) {
            if(currNode.getValue() > value) {
                if(currNode.getLeft() == null) {
                    currNode.setLeft(newNode);
                    return;
                }
                currNode = currNode.getLeft();
            } else {
                if(currNode.getRight() == null) {
                    currNode.setRight(newNode);
                    return;
                }
                currNode = currNode.getRight();
            }
        }
    }

    public void printTree() {
        if(root == null) {
            return;
        }
        printTree(root);
    }

    public void printTree(MyBinaryNodeP1 node) {
        System.out.println(node.getValue());
        if(node.getLeft() != null) {
            printTree(node.getLeft());
        }
        if(node.getRight() != null) {
            printTree(node.getRight());
        }
    }
    public List<Integer> breathFirstSearchIteratively() {
        MyBinaryNodeP1 currNode = root;
        List<Integer> list = new ArrayList<>();
        Queue<MyBinaryNodeP1> queue = new LinkedList<>();
        if(currNode == null) {
            return list;
        }
        queue.add(currNode);
        while(!queue.isEmpty()) {
            currNode = queue.poll();
            list.add(currNode.getValue());
            if(currNode.getLeft() != null) {
                queue.add(currNode.getLeft());
            }
            if(currNode.getRight() != null) {
                queue.add(currNode.getRight());
            }
        }
        return list;
    }

    public List<Integer> breathFirstSearchRecursively() {
        List<Integer> list = new ArrayList<>();
        Queue<MyBinaryNodeP1> queue = new LinkedList<>();
        queue.add(root);
        return breathFirstSearchRecursively(queue, list);
    }

    public List<Integer> breathFirstSearchRecursively(Queue<MyBinaryNodeP1> queue, List<Integer> list) {
        if(queue.isEmpty()) {
            return list;
        }
        MyBinaryNodeP1 currNode = queue.poll();
        list.add(currNode.getValue());
        if(currNode.getLeft() != null) {
            queue.add(currNode.getLeft());
        }
        if(currNode.getRight() != null) {
            queue.add(currNode.getRight());
        }
        return breathFirstSearchRecursively(queue, list);
    }

    public List<Integer> depthFirstSearchInOrder() {
        return depthFirstSearchInOrder(root, new ArrayList<>());
    }

    public List<Integer> depthFirstSearchInOrder(MyBinaryNodeP1 currNode, List<Integer> list) {
        if(currNode.getLeft() != null) {
            depthFirstSearchInOrder(currNode.getLeft(), list);
        }
        list.add(currNode.getValue());
        if(currNode.getRight() != null) {
            depthFirstSearchInOrder(currNode.getRight(), list);
        }
        return list;
    }

    public List<Integer> depthFirstSearchPreOrder() {
        return depthFirstSearchPreOrder(root, new ArrayList<>());
    }

    public List<Integer> depthFirstSearchPreOrder(MyBinaryNodeP1 currNode, List<Integer> list) {
        list.add(currNode.getValue());

        if(currNode.getLeft() != null) {
            depthFirstSearchPreOrder(currNode.getLeft(), list);
        }

        if(currNode.getRight() != null) {
            depthFirstSearchPreOrder(currNode.getRight(), list);
        }
        return list;
    }

    public List<Integer> depthFirstSearchPostOrder() {
        return depthFirstSearchPostOrder(root, new ArrayList<>());
    }

    private List<Integer> depthFirstSearchPostOrder(MyBinaryNodeP1 currNode, List<Integer> list) {
        if(currNode.getLeft() != null) {
            depthFirstSearchPostOrder(currNode.getLeft(), list);
        }
        if(currNode.getRight() != null) {
            depthFirstSearchPostOrder(currNode.getRight(), list);
        }
        list.add(currNode.getValue());
        return list;
    }

    public static void main(String[] args) {
        MyBinarySearchTreeP1 tree = new MyBinarySearchTreeP1();
        tree.insert(9);
        tree.insert(4);
        tree.insert(21);
        tree.insert(1);
        tree.insert(6);
        tree.insert(15);
        tree.insert(170);
        tree.printTree();
        System.out.println("----------------");
        //tree.remove(20);
        //tree.remove(4);
        //tree.printTree();
        tree.insert(20);
        tree.insert(18);
        tree.insert(10);
        tree.printTree();
        System.out.println("----------------");
        //tree.remove(170);
        //tree.printTree();
        System.out.println("----------------");
        System.out.println("Breath first search " + tree.breathFirstSearchIteratively()); // [9, 4, 21, 1, 6, 15, 170, 10, 20, 18]
        System.out.println("Breath first search " + tree.breathFirstSearchRecursively()); // [9, 4, 21, 1, 6, 15, 170, 10, 20, 18]
        System.out.println("Depth first search - in order " + tree.depthFirstSearchInOrder()); // [1, 4, 6, 9, 10, 15, 18, 20, 21, 170]
        System.out.println("Depth first search - pre order " + tree.depthFirstSearchPreOrder()); // [9, 4, 1, 6, 21, 15, 10, 20, 18, 170]
        System.out.println("Depth first search - post order " + tree.depthFirstSearchPostOrder()); // [1, 6, 4, 10, 18, 20, 15, 170, 21, 9]
    }
}
