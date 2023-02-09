package org.example;

class Cliente {
    private org.example.dialogo dialogo;

    public Cliente(FabricaDialogo fabrica) {
        dialogo = fabrica.crearDialogo();
    }

    public void render() {
        dialogo.render();
    }

    public void mostrarMensaje() {
        dialogo.mostrarMensaje();
    }
}