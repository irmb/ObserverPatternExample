package de.tubs.bau.irmb.observer.view;

import de.tubs.bau.irmb.observer.presentation.TemperatureDisplay;

import javax.swing.*;
import java.awt.*;

public class SwingTemperatureDisplay extends JFrame implements TemperatureDisplay {

    private final JLabel currentTemperatureLabel;
    private final String defaultText = "Aktuelle Temperatur: ";

    public SwingTemperatureDisplay() {
        currentTemperatureLabel = new JLabel(defaultText);
        var layout = new BorderLayout();
        var content = new JPanel();
        content.setLayout(layout);
        content.add(currentTemperatureLabel, BorderLayout.CENTER);
        add(content);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void showTemperature(double temperature) {
        currentTemperatureLabel.setText(defaultText + temperature + " °C");
    }
}
