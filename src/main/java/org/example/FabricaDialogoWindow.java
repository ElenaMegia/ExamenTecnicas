package org.example;

public class FabricaDialogoWindow implements FabricaDialogo{

    public dialogo crearDialogo() {
        return new DialogoWindows();
    }
}

