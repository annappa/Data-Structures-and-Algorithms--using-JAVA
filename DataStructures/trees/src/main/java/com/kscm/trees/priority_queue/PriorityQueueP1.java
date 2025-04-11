package com.kscm.trees.priority_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriorityQueueP1 {
    private List<NodeP1> pqArr = new ArrayList<>();
    public PriorityQueueP1() {

    }

    public void enqueue(String value, int priority) {
        NodeP1 newNode = new NodeP1(value, priority);
        boolean inserted = false;
        for(int i=0; i < pqArr.size() - 1; i++) {
            if(pqArr.get(i).getPriority() > priority) {
                pqArr.add(i, newNode);
                inserted = true;
            }
        }

        if(!inserted) {
            pqArr.add(newNode);
        }
    }

    public String[] printQueue() {
        String[] array = new String[pqArr.size()];
        for(int i=0; i < array.length; i++) {
            array[i] = pqArr.get(i).getValue();
        }
        return array;
    }

    public String dequeue() {
        if(pqArr.size() == 0) {
            return "Empty queue";
        }
        NodeP1 n1 = pqArr.get(0);
        pqArr.remove(0);
        return n1.getValue();
    }

    public String front() {
        if(pqArr.size() == 0) {
            return "Empty Queue";
        }
       return pqArr.get(0).getValue();
    }

    public String rear() {
        if(pqArr.size() == 0) {
            return "Empty Queue";
        }
        return pqArr.get(pqArr.size()-1).getValue();
    }

    public static void main(String[] args) {
        PriorityQueueP1 pq1 = new PriorityQueueP1();
        pq1.enqueue("piyush", 3);
        pq1.enqueue("rohan", 1);
        pq1.enqueue("jeet", 2);
        pq1.enqueue("john", 5);
        pq1.enqueue("Dave", 4);
        System.out.println(Arrays.toString(pq1.printQueue()));
        System.out.println(pq1.dequeue());
    }
}
