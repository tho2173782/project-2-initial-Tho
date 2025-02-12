package com.csc205.project2;

public class Pyramid {
    private double width;
    private double height;

    public Pyramid(){
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    public Pyramid(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    //Getters and Setters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea(){
        return width * width + width * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
    }

    public double volume(){
        return (width * width * height) / 3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
