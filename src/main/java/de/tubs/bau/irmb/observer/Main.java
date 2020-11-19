package de.tubs.bau.irmb.observer;

import de.tubs.bau.irmb.observer.model.RandomTemperatureProvider;
import de.tubs.bau.irmb.observer.model.TemperatureSensor;
import de.tubs.bau.irmb.observer.presentation.TemperatureDisplayPresenter;
import de.tubs.bau.irmb.observer.view.ConsoleTemperatureDisplay;
import de.tubs.bau.irmb.observer.view.SwingTemperatureDisplay;

public class Main {
    public static void main(String[] args) {
        var sensor = new TemperatureSensor();

        var temperatureProvider = new RandomTemperatureProvider();
        temperatureProvider.setSensor(sensor);

//        var temperatureView = new ConsoleTemperatureDisplay();
        var temperatureView = new SwingTemperatureDisplay();
        temperatureView.setVisible(true);

        var presenter = new TemperatureDisplayPresenter(sensor, temperatureView);
    }
}
