package org.alejandroArias.model;

public class Oyente implements Receptor{
    /*
      Clase oyente que implementa la interfaz Receptor
        Esta clase es la que recibe el mensaje y lo imprime en consola
     */

    private String nombre;

    public Oyente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Mensaje recibido: " + mensaje+ " por " + nombre);
    }
}
