package org.example;

class FabricaDialogoMac implements FabricaDialogo {
    @Override
    public dialogo crearDialogo() {
        return new dialogoMac();
    }
}