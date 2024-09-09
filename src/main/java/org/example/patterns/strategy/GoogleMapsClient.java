package org.example.patterns.strategy;

public class GoogleMapsClient {
    public static void main(String[] args) {
        IPathCalculator iPathCalculator = GoogleMapsFactory.getPathCalculator("Mumbai", "Pune", PathMode.BUS);
        iPathCalculator.findPath();
    }
}
