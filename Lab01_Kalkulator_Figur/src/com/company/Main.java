package com.company;

import java.util.Scanner;
import java.util.concurrent.TransferQueue;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while(shouldContinue) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1 = Wybór figury");
            System.out.println("2 = Wyjdź z programu");

            int userChoice1 = scanner.nextInt();

            switch (userChoice1) {
                case 1:
                    System.out.println("Wybierz Figure:");
                    System.out.println("1 = Kwadrat");
                    System.out.println("2 = Trójkąt");
                    System.out.println("3 = Koło");
                    int userChoice2 = scanner.nextInt();
                    switch(userChoice2) {
                        case 1:
                            //kwadrat
                            System.out.println("Podaj bok kwadratu: ");
                            double aS1;
                            aS1=scanner.nextDouble();
                            Figure squareData = new Square(aS1);
                            squareData.calculateArea();
                            squareData.calculatePerimeter();
                            squareData.print();
                            System.out.println("Chcesz obliczyć objętość i pole powierzchni graniastosłupa o tej samej podstawie? [1=TAK/2=NIE]: ");
                            //bryła
                            int choice1;
                            choice1=scanner.nextInt();
                            if(choice1==1) {
                                System.out.println("Podaj wysokość graniastosłupa: ");
                                double heightS1=scanner.nextDouble();
                                double ppSize1 = squareData.calculateArea();
                                Prism prismSquareData = new Prism(4*aS1*heightS1,heightS1,ppSize1);
                                prismSquareData.calculateArea();
                                prismSquareData.calculatePerimeter();
                                prismSquareData.print();
                            }
                            break;

                        case 2:
                            //trójkąt
                            System.out.println("Podaj boki trójkąta: ");
                            double aS2,aS22, aS222;
                            aS2=scanner.nextDouble();
                            aS22=scanner.nextDouble();
                            aS222=scanner.nextDouble();
                            System.out.println("Podaj wysokość trójkąta: ");
                            double hS1;
                            hS1=scanner.nextDouble();
                            Figure triangleData = new Triangle(aS2,aS22,aS222,hS1);
                            triangleData.calculateArea();
                            triangleData.calculatePerimeter();
                            triangleData.print();
                            System.out.println("Chcesz obliczyć objętość i pole powierzchni graniastosłupa o tej samej podstawie? [1=TAK/2=NIE]: ");
                            //bryła
                            int choice2;
                            choice2=scanner.nextInt();
                            if(choice2==1) {
                                System.out.println("Wybierz dlugosc boku do graniastosłupa: ");
                                System.out.println("1 długość = " + aS2);
                                System.out.println("2 długość = " + aS22);
                                System.out.println("3 długość = " + aS222);
                                int choiceSize =scanner.nextInt();
                                double aSizeChoice=0;
                                switch(choiceSize) {
                                    case 1 -> aSizeChoice = aS2;
                                    case 2 -> aSizeChoice = aS22;
                                    case 3 -> aSizeChoice = aS222;
                                }
                                Figure newTriangleData= new Triangle(aSizeChoice,aSizeChoice,aSizeChoice,hS1);
                                System.out.println("Podaj wysokość graniastosłupa: ");
                                double heightS=scanner.nextDouble();
                                double ppSize2 = newTriangleData.calculateArea();
                                Prism prismTriangleData = new Prism(3*aSizeChoice*heightS,heightS,ppSize2);
                                prismTriangleData.calculateArea();
                                prismTriangleData.calculatePerimeter();
                                prismTriangleData.print();
                            }
                            break;

                        case 3:
                            //koło
                            System.out.println("Podaj promień koła: ");
                            double rS1;
                            rS1=scanner.nextDouble();
                            Figure circleData = new Circle(rS1);
                            circleData.calculateArea();
                            circleData.calculatePerimeter();
                            circleData.print();
                            System.out.println("Chcesz obliczyć objętość i pole powierzchni walca? [1=TAK/2=NIE]: ");
                            //bryła
                            int choice3;
                            choice3=scanner.nextInt();
                            if(choice3==1) {
                                System.out.println("Podaj wysokość walca: ");
                                double heightS3=scanner.nextDouble();
                                double ppSize3 = circleData.calculateArea();
                                double PI=3.141592;
                                Prism prismCircleData = new Prism(2*PI*rS1*heightS3,heightS3,ppSize3)
                                prismCircleData.calculateArea();
                                prismCircleData.calculatePerimeter();
                                prismCircleData.print();
                            }
                            break;
                    }
                    break;
                case 2:
                    shouldContinue =false;
                    break;
            }
        }

    }
}


