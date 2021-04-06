package com.company;

import com.company.Figure;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Circle extends Figure
        implements Printable {

    double rSize;
    static double PI=3.141592;
    double Area;
    double Perimeter;

    public Circle(double rSize) {
        if(rSize<=0)
            throw new IllegalArgumentException("Promień nie może być mniejszy bądź równy 0!");
        this.rSize = rSize;
    }

    @Override
    protected double calculateArea() {
        Area=PI*rSize*rSize;
        return Area;
    }

    @Override
    protected double calculatePerimeter() {
        Perimeter = 2*PI*rSize;
        return Perimeter;
    }


    @Override
    public void print() {
        System.out.println("Pole: " + Area );
        System.out.println("Obwód: : " + Perimeter );
    }
}

