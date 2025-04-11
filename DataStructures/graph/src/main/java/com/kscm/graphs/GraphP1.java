package com.kscm.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class GraphP1 {
    private Map<Integer, ArrayList<Integer>> adjacentList = new HashMap<>();

    private void addVertex(int vertexVal) {
        adjacentList.put(vertexVal, new ArrayList<>());
    }

    public void addEdge(int edgeP1Val, int edgeP2Val) {
        adjacentList.get(edgeP1Val).add(edgeP2Val);
        adjacentList.get(edgeP2Val).add(edgeP1Val);
    }

    public void showConnections() {
        for(Map.Entry<Integer, ArrayList<Integer>> entry: adjacentList.entrySet()) {
            System.out.println(entry.getKey() + " -----> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        GraphP1 graph = new GraphP1();
        graph.addVertex(3);
        graph.addVertex(55);
        graph.addVertex(54);

        graph.addEdge(3, 55);
        graph.addEdge(3, 54);

        graph.showConnections();
    }
}
