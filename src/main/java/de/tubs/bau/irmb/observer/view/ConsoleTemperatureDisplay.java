package de.tubs.bau.irmb.observer.view;

import de.tubs.bau.irmb.observer.presentation.TemperatureDisplay;

public class ConsoleTemperatureDisplay implements TemperatureDisplay {
    @Override
    public void showTemperature(double temperature) {
        System.out.println("Aktuelle Temperatur: " + temperature + " °C");
    }
}
