package org.alejandroArias.model;

public class EstadoDetenido implements Estado {
    /*
      Implementaciones específicas del reproductor de música
      cuando el estado es Detenido
     */
    @Override
    public void reproducir() {
        System.out.println("Iniciando la reproducción");
    }

    @Override
    public void pausar() {
        System.out.println("No se puede pausar, no se está reproduciendo");
    }

    @Override
    public void detener() {
        System.out.println("No se puede detener, no se está reproduciendo");
    }

}
