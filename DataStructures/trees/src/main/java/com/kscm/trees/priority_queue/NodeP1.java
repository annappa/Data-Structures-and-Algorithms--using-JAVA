package com.kscm.trees.priority_queue;

public class NodeP1 {
    private int priority;
    private String value;

    public NodeP1(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
