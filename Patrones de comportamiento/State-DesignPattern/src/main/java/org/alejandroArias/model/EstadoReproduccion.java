package org.alejandroArias.model;

public class EstadoReproduccion implements Estado {
    /*
      Implementaciones específicas del reproductor de música
      cuando el estado es reproducción
     */
    @Override
    public void reproducir() {
        System.out.println("El reproductor ya está reproduciendo");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando la reproducción");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo la reproducción");
    }
}
