package org.itstep;

public class Main {
    public static void main(String[] args){
        Graph graph = new Graph();
        for (int i=0; i<7; i++){
            graph.addVertex(i);
        }
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(4,5);
    }
}

