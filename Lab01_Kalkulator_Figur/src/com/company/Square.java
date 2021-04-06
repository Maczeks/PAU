package com.company;

import com.company.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Square extends Figure
        implements Printable {

    double aSize;
    double Area;
    double Perimeter;

    public Square(double aSize) {
        if(aSize<=0)
            throw new IllegalArgumentException("Bok mniejszy od 0!");
        this.aSize = aSize;
    }

    @Override
    protected double calculateArea() {
        Area = aSize * aSize;
        return Area;
    }

    @Override
    protected double calculatePerimeter() {
        Perimeter = 4 * aSize;
        return Perimeter;
    }


    @Override
    public void print() {
        System.out.println("Pole: " + Area );
        System.out.println("Obwód: : " + Perimeter );
    }
}
