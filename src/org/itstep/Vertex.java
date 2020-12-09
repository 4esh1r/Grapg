package org.itstep;

public class Vertex {
    public int getId;
    private int id;
    private boolean isVisited;
    public Vertex(int id) {
    this.id = id;
    }

    public boolean isVisited() {
    return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
    public int getId(){
        return id;
    }
}
