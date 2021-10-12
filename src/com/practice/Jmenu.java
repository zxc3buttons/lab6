package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jmenu extends JFrame {

    JTextArea textArea = new JTextArea();

    JFrame frame = new JFrame();
    JMenuBar menuBar = new JMenuBar();

    JMenu changeColorMenu = new JMenu("Color");
    JMenu changeFontMenu = new JMenu("Font");

    //colors
    JMenuItem blue = new JMenuItem("Blue");
    JMenuItem red = new JMenuItem("Red");
    JMenuItem black = new JMenuItem("Black");


    //fonts
    JMenuItem TNR = new JMenuItem("Times New Roman");
    JMenuItem MSSS = new JMenuItem("MS Sans Serif");
    JMenuItem CourierNew = new JMenuItem("Courier New");



    public Jmenu() {

        super("menuExample");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        changeColorMenu.add(TNR);
        changeColorMenu.add(MSSS);
        changeColorMenu.add(CourierNew);
        menuBar.add(changeColorMenu);

        changeFontMenu.add(blue);
        changeFontMenu.add(red);
        changeFontMenu.add(black);
        menuBar.add(changeFontMenu);


        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        TNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.BOLD, 16));
            }
        });

        MSSS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.ITALIC, 16));
            }
        });

        CourierNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.TYPE1_FONT, 16));
            }
        });

        frame.setJMenuBar(menuBar);
        frame.add(textArea);
        frame.setVisible(true);
    }
}
