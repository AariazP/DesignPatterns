package org.alejandroArias.model;

public class EstadoPausado implements Estado {

    /*
      Implementaciones específicas del reproductor de música
      cuando el estado es pausado
     */

    @Override
    public void reproducir() {
        System.out.println("Reanudando la reproducción");
    }

    @Override
    public void pausar() {
        System.out.println("No se puede pausar, ya está pausado");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la reproducción");
    }

}
