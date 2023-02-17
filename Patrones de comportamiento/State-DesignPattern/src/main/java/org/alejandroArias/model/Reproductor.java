package org.alejandroArias.model;

public class Reproductor {

    /*
     Esta clase mantiene un estado interno que es el que determina el comportamiento
     del reproductor de música. El estado interno puede ser:
        - EstadoReproduction
        - EstadoPausado
        - EstadoDetenido
       Lo que buscamos es que dependiendo del estado interno, el reproductor de música
       realice una acción u otra. Desde el punto de vista de quien usa el reproductor de música
       no importa el estado interno, solo importa que el reproductor de música haga una acción
       u otra. Se verá como si el reproductor de música cambiara de clase cuando en realidad únicamente
       cambia de estado.
     */
    private Estado estado;

    public Reproductor() {
        this.estado = new EstadoDetenido();
    }

    //segun los estados, se actualizará el estado interno del reproductor de música
    public void reproducir() {
        this.estado.reproducir();
        estado = new EstadoReproduccion();
    }

    public void pausar() {
        this.estado.pausar();
        estado = new EstadoPausado();
    }

    public void detener() {
        this.estado.detener();
        estado = new EstadoDetenido();
    }

    //getter y setter del estado interno del reproductor de música

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado;
    }

}
