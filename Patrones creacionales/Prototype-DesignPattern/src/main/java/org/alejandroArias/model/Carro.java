package org.alejandroArias.model;

public class Carro implements Cloneable {
    /**
     * Es importante que la clase Carro implemente la interfaz Cloneable
     * para que el método clone() funcione correctamente.
     * Este método es el que se encarga de clonar el objeto.
     * Es decir, construir un nuevo objeto con los mismos atributos que el objeto original.
     * Pero con una nueva instancia de memoria.
     */
    private String marca;
    private String modelo;
    private String color;
    private String placa;


    public Carro() {
    }


    public Carro(String marca, String modelo, String color, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Este método es el que se encarga de clonar el objeto.
     * @return un carro clonado, con los mismos atributos que el objeto original
     * pero con una nueva instancia de memoria.
     */
    @Override
    public Carro clone() {
        try {
            return (Carro) super.clone(); // el método clone() de la clase Object es el que se encarga de clonar el objeto
                                            //Este método devuelve un objeto de tipo Object, por eso hacemos un cast a Carro
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Muchas veces no es necesario capturar la excepción CloneNotSupportedException
                                        //Ya que la clase Object implementa la interfaz Cloneable, por lo que el método clone()
                                        //siempre funcionará correctamente. Sin embargo, para evitar errores, es recomendable
        }
    }
}
