package de.tubs.bau.irmb.observer.model;

public class TemperatureSensor extends Subject {

    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }
}
