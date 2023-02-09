package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JPanel ventana;
    private JButton WindowBt;
    private JButton MacBt;
    private JLabel texto;

    public Menu() {
        WindowBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Window");
            }
        });
        MacBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "MAC");
            }
        });
    }

    public JPanel getPanel() {
        return ventana;
    }
}