package de.tubs.bau.irmb.observer.presentation;

import de.tubs.bau.irmb.observer.model.Observer;
import de.tubs.bau.irmb.observer.model.TemperatureSensor;

public class TemperatureDisplayPresenter implements Observer {

    private TemperatureDisplay view;
    private final TemperatureSensor sensor;

    public TemperatureDisplayPresenter(TemperatureSensor sensor, TemperatureDisplay view) {
        this.sensor = sensor;
        this.view = view;
        this.sensor.addObserver(this);
    }

    @Override
    public void update() {
        double temperature = sensor.getTemperature();
        view.showTemperature(temperature);
    }
}
