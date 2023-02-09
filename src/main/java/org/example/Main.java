package org.example;


import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione el sistema operativo: 1. Windows 2. Mac");
        int opcion = scan.nextInt();
        FabricaDialogo fabrica;
        if (opcion == 1) {
            fabrica = new FabricaDialogoWindow();
        } else {
            fabrica = new FabricaDialogoMac();
        }
        Cliente cliente = new Cliente(fabrica);
        cliente.mostrarMensaje();
    }
}