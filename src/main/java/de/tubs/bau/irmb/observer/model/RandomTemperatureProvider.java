package de.tubs.bau.irmb.observer.model;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class RandomTemperatureProvider {

    private Timer timer;

    public void setSensor(TemperatureSensor sensor) {
        recreateTimer(sensor);
    }

    private void recreateTimer(TemperatureSensor sensor) {
        if (timer != null) timer.cancel();
        timer = new Timer();
        timer.scheduleAtFixedRate(new TemperatureTimerTask(sensor), 0, 2000);
    }

    private static class TemperatureTimerTask extends TimerTask {

        private final TemperatureSensor sensor;
        private final Random random = new Random();

        public TemperatureTimerTask(TemperatureSensor sensor) {
            this.sensor = sensor;
        }

        @Override
        public void run() {
            var factor = random.nextInt(30);
            sensor.setTemperature(random.nextDouble() * factor);
        }
    }

}