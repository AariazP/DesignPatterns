package org.alejandroArias.model;

import java.util.ArrayList;

public class Emisora implements Emisor{

    /*
     * Emisora tiene una lista de receptores
     * este es el ejemplo de la relación de dependencia
     * y es la encarga de emitir el mensaje usando el patrón observer
     */
    private ArrayList<Receptor> receptores;

    public Emisora() {
        receptores = new ArrayList<>();
    }

    public void agregarReceptor(Receptor receptor) {
        receptores.add(receptor);
    }

    /**
     * Metodo que emite el mensaje y lo envía a los receptores
     * @param mensaje mensaje a enviar
     */
    @Override
    public void emitir(String mensaje) {
        System.out.println("Mensaje emitido: " + mensaje);
        for (Receptor receptor : receptores) {
            receptor.recibir(mensaje);
        }
    }

    public ArrayList<Receptor> getReceptores() {
        return receptores;
    }

    public void setReceptores(ArrayList<Receptor> receptores) {
        this.receptores = receptores;
    }
}
