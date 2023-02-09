package org.example;

import javax.swing.*;
import java.awt.*;

public class DialogoWindows implements dialogo {
    private JFrame Main;
    private JPanel Panel;
    @Override
    public void render() {
        Main = new JFrame();
        Main.setTitle("Ventana de Windows");
        Main.setSize(500, 500);
        Main.setLocationRelativeTo(null);
        Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main.setVisible(true);

        Panel = new JPanel(new CardLayout());
        Panel.setSize(500, 500);

        IniciarPaneles();
    }

    @Override
    public void mostrarMensaje() {
        JOptionPane.showMessageDialog(null, "Ventana de Windows");
    }

    private void IniciarPaneles(){

        //añadimos ventanita
        Menu ventanita = new Menu();
        JPanel ventanitaPanel = ventanita.getPanel();

        Panel.add(ventanitaPanel, "Ventanita");

        Main.add(Panel);
        Main.pack();
        Main.setSize(500, 500);
        Main.setResizable(false);
        Main.setVisible(true);


    }


}
