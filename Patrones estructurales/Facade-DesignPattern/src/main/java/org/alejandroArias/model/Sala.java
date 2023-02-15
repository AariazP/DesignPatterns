package org.alejandroArias.model;

public class Sala {

    /*
     Donde se proyecta la pelicula
     */
    private int numero;
    private int capacidad;
    private String tipo;


    public Sala(int numero, int capacidad, String tipo) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
