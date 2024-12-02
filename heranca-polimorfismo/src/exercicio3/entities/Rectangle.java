package exercicio3.entities;

import exercicio3.entities.enums.Color;

public class Rectangle extends Shape {

    private Double length;
    private Double width;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double length, Double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }
}
