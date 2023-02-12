package org.alejandroArias.model;

public class Cafe implements Bebida {

    /*
     La idea es que el café al implementar la interfaz bebida, ya puede ser decorado con endulzante, con shot de espresso, etc.
     Es decir, el patrón lo podríamos resumir en que la clase que queremos decorar debe implementar la interfaz Bebida
     y crear decoradores que dentro tenga un atributo de tipo Bebida, que es la clase que queremos decorar.
     */

    /**
        Este método nos devuelve la descripción concreta del café
        @return String con la descripción del café
     */
    @Override
    public String getDescripcion() {
        return "Café";
    }



    /**
        Este método nos devuelve el costo concreto del café
        @return double con el costo del café
     */
    @Override
    public double getCosto() {
        return 1.0;
    }


}
