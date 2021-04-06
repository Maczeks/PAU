package com.company;

import java.util.Collections;

enum trainState {
    NOWY {
        public String toString() {
            return "Nowy";
        }
    },
    PRZERWA{
        public String toString() {
            return "Przerwa";
        }
    },
}

public class Train implements Comparable<Train>{
    String nazwa;
    int iloscMiejsc;
    trainState stan;

    public Train(String nazwa, int iloscMiejsc, trainState stan) {
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;
        this.stan = stan;
    }

    public void print(){
        System.out.println("Nazwa pociągu: " + nazwa);
        System.out.println("Ilość miejsc w pociągu: " + iloscMiejsc);
        System.out.println("Stan pociągu: " + stan);
    }

    @Override
    public int compareTo(Train train) {
        int compareName = this.nazwa.compareTo(train.nazwa);
        if(compareName==0)
            return this.stan.compareTo(train.stan);
        else
            return compareName;
    }

}
