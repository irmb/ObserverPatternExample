package de.tubs.bau.irmb.observer.view;

import javax.swing.*;
import java.awt.*;

public class SwingTemperatureDisplay extends JFrame {

    private JLabel currentTemperatureLabel;
    private final String defaultText = "Aktuelle Temperatur: ";

    public SwingTemperatureDisplay() {
        setupUI();
    }

    private void setupUI() {
        currentTemperatureLabel = new JLabel(defaultText);
        var layout = new BorderLayout();
        var content = new JPanel();
        content.setLayout(layout);
        content.add(currentTemperatureLabel, BorderLayout.CENTER);
        add(content);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
