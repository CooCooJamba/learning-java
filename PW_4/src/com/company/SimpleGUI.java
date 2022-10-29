package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private int milan = 0;
    private int madrid = 0;
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel label1 = new JLabel("Result: 0 X 0");
    private JLabel label2 = new JLabel("Last Scorer: N/A");
    private JLabel label3 = new JLabel("Winner: DRAW");
    public SimpleGUI() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 1, 2, 2));
        container.add(label1);
        container.add(label2);
        container.add(label3);

        ButtonGroup group = new ButtonGroup();
        button1.addActionListener((button1) -> {
            milan++;
            label1.setText("Result: " + milan + " X " + madrid);
            label2.setText("Last Scorer: AC Milan");
            label3.setText("Winner: " + (milan > madrid ? "AC Milan" : "Real Madrid"));
        });
        container.add(button1);
        button2.addActionListener((button2) -> {
            madrid++;
            label1.setText("Result: " + milan + " X " + madrid);
            label2.setText("Last Scorer: Real Madrid");
            label3.setText("Winner: " + (madrid > milan ? "Real Madrid" : "AC Milan"));
        });
        container.add(button2);
    }
}
