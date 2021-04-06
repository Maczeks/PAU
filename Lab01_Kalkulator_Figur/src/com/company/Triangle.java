package com.company;

import com.company.Figure;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.security.Principal;

public class Triangle extends Figure
        implements Printable {

    double aSize;
    double bSize;
    double cSize;
    double hSize;
    double Area;
    double Perimeter;

    public Triangle(double aSize,double bSize,double cSize, double hSize) {
        if(!(aSize+bSize>cSize && bSize+cSize>aSize && aSize+cSize>bSize) || aSize<=0 || bSize<=0 || cSize<=0 || hSize<=0)
            throw new IllegalArgumentException("Boki są źle dobrane nie da się stworzyć trójkąta!");
        this.aSize = aSize;
        this.hSize = hSize;
        this.bSize = bSize;
        this.cSize = cSize;
    }

    @Override
    protected double calculateArea() {
        Area = 0.5 * cSize * hSize;
        return Area;
    }

    @Override
    protected double calculatePerimeter() {
        Perimeter = aSize+bSize+cSize;
        return Perimeter;
    }

    @Override
    public void print() {
        System.out.println("Pole: " + Area );
        System.out.println("Obwód: : " + Perimeter );
    }

}

