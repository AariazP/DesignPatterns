package org.alejandroArias.model;

public class SistemaSonido {

    /*
      Se encarga de configurar el sistema de sonido del cine
     */

    private String tipo;
    private String marca;
    private String modelo;

    public SistemaSonido(String tipo, String marca, String modelo) {
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
        System.out.println("Encendiendo sistema de sonido");
    }

    public void ajustarVolumen() {

        System.out.println(" Ajustando el volumen del sistema de sonido " );

    }

    public void apagar() {

        System.out.println(" Apagando el sistema de sonido " );
    }
}
