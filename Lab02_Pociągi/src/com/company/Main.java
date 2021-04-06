package com.company;


public class Main {

    public static void main(String[] args) {
        //Train
    Train train1 = new Train("KrakowWarszawa",200,trainState.NOWY);
    Train train2 = new Train("WarszawaSzczecin",150,trainState.PRZERWA);
    train1.print();
    train2.print();

    //TrainStationContainer
        System.out.println();
        System.out.println();
        TrainStationContainer container = new TrainStationContainer();
        //Dodawanie
        String name1="Kraków";
        int number1=10;
        TrainStation trainStation = new TrainStation(name1,number1);
        trainStation.addTrain(train1);
        container.addStation(trainStation);

        String name2="Warszawa";
        int number2=12;
        TrainStation trainStation2 = new TrainStation(name2,number2);
        container.addStation(trainStation2);
        container.printStations();

        //Usuwanie
        System.out.println("Po usunięciu: ");
        container.removeStation(name2);
        trainStation.removeTrain(train1);
        container.printStations();

        /////TrainStation
        System.out.println();
        System.out.println();
        //Dodawanie stacji
        TrainStation trainStation1 = new TrainStation("Szczecin",10);
        container.addStation(trainStation1);
        trainStation1.addTrain(train2);
        trainStation1.printAll();
        trainStation1.howMuchState(trainState.PRZERWA);
        System.out.println();
        System.out.println();
        //trainStation1.maxCapacity();
        //container.printStations();

        //Sortowanie
        System.out.println();
        System.out.println();
        Train train3 = new Train("SzczecinKraków",200,trainState.PRZERWA);
        Train train4 = new Train("SzczecinGdańsk",150,trainState.NOWY);
        trainStation1.addTrain(train3);
        trainStation1.addTrain(train4);
        trainStation1.printAll();
        System.out.println();
        System.out.println("Po sortowaniu: ");
        trainStation1.sortNames();
        trainStation1.printAll();

        //trainStation1.howMuchState(trainState.PRZERWA);
        //System.out.println();
        //container.printStations();
    }
}
