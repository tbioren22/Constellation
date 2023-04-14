package trb;

import java.awt.Color;

public class Star {
    private int id;
    private double x;
    private double y;
    private double size;
    private Color color;
    private int[] connections;

    public Star() {
    }

    public String toString() {
        String output = "Star [id=" + id + ", x=" + x + ", y=" + y + ", size=" + size + ", color=" + color + ", [";
        for(int i : connections) {
            output += i + ", ";
        }
        output = output.substring(0, output.length()-2) + "]";
        return output;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = Color.decode(color);
    }
    public int[] getConnections() {
        return connections;
    }
    public void setConnections(int[] connections) {
        this.connections = connections;
    }
}