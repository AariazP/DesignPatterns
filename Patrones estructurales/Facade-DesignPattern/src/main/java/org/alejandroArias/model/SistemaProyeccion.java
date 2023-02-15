package org.alejandroArias.model;

public class SistemaProyeccion {

    /*
     Se encarga de reproducir la película en la sala de cine.
     */

    private String tipo;
    private String marca;
    private String modelo;

    public SistemaProyeccion(String tipo, String marca, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println(" Encendiendo sistema de proyección");
    }

    public void reproducirPelicula(Pelicula pelicula) {

        System.out.println(" Reproduciendo película: " + pelicula.getNombre());
    }

    public void apagar() {

        System.out.println(" Apagando el sistema de proyección " );
    }
}
