package org.example.patterns.strategy;

public class GoogleMapsFactory {

    public static IPathCalculator getPathCalculator(String src, String dest, PathMode pathMode){
        if(pathMode.equals(PathMode.CAR))
            return new CarPathCalculator();
        else if(pathMode.equals(PathMode.BUS))
            return new BusPathCalculator();
        else if(pathMode.equals(PathMode.BIKE))
            return new BikePathCalculator();
        else
            return null;
    }
}
