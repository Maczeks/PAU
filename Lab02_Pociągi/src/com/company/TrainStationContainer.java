package com.company;

import java.util.HashMap;
import java.util.Map;

public class TrainStationContainer {

    Map<String,TrainStation> stations=new HashMap<>();

    public TrainStation addStation(TrainStation trainStation) {
        stations.put(trainStation.nazwaStacji, trainStation);
        return trainStation;
    }

    public void removeStation(String nazwa) {
        stations.remove(nazwa);
    }

    public void emptyStations() {
        for (TrainStation station:stations.values()) {
            if(station.obecnaPojemnosc==0) {
                System.out.println(stations);
            }
        }
    }

    public void printStations() {
        for (TrainStation station:stations.values()) {
            System.out.println("Nazwa: " + station.nazwaStacji);
            System.out.println("Obciążenie: " + station.obecnaPojemnosc);
        }
    }
}
