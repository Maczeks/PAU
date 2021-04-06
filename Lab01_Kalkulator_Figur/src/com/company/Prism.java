package com.company;

public class Prism extends Figure{

    double edgeSize;
    double ppSize;
    double heightSize;
    double area;
    double capacity;

    public Prism(double edgeSize, double heightSize,  double ppSize) {
        this.edgeSize = edgeSize;
        this.heightSize = heightSize;
        this.ppSize = ppSize;
    }


    @Override
    protected double calculateArea() {
        area = edgeSize+ppSize+ppSize;
        return area;
    }

    @Override
    protected double calculatePerimeter() {
        capacity=ppSize*heightSize;
        return capacity;
    }

    @Override
    public void print() {
        System.out.println("Pole powierzchni bryły: " + area);
        System.out.println("Objętość bryły : " + capacity);
    }
}
