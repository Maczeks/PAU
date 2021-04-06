package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TrainStation {
    String nazwaStacji;
    int maksymalnaPojemnosc;

    public TrainStation(String nazwaStacji, int maksymalnaPojemnosc) {
        this.nazwaStacji = nazwaStacji;
        this.maksymalnaPojemnosc = maksymalnaPojemnosc;
    }

    List <Train> trainList = new ArrayList<>();
    int obecnaPojemnosc=0;


    public void addTrain(Train train) {
        if(obecnaPojemnosc!=maksymalnaPojemnosc) {
            trainList.add(train);
            obecnaPojemnosc += 1;
        }
        else
           System.err.println("Stacja jest pełna!");
    }

    public void removeTrain(Train train) {
        trainList.remove(train);
        obecnaPojemnosc-=1;
    }

    public void howMuchState (trainState stan) {
        int licznik = 0;
        for (Train train:trainList) {
            if(train.stan==stan) {
                licznik++;
            }
        }

        System.out.println("Ilość pociągów o takim stanie: " + licznik);
    }

    public void printAll() {
        System.out.println(nazwaStacji);
        for(Train train:trainList) {
            System.out.println("Nazwa pociągu: " + train.nazwa);
            System.out.println("Ilość miejsc: " + train.iloscMiejsc);
            System.out.println("Stan: " + train.stan);
        }
    }

    public void sortNames() {
        Collections.sort(trainList);
    }

    public Train maxCapacity() {
        return Collections.max(this.trainList);
    }
}
