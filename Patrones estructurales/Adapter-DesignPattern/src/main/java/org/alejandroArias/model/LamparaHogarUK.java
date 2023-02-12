package org.alejandroArias.model;

public class LamparaHogarUK {
    /**
     * Clase que no implementa la interfaz Enchufable,
     * pero queremos adaptarla para que funcione con el enchufe de Latinoamérica
     */

    // Atributo que representa el puerto de la lámpara y que lo diferenciará de las demás
    private String puerto;

    /**
     * Constructor que recibe el puerto de la lámpara
     * @param puerto Puerto de la lámpara
     */
    public LamparaHogarUK(String puerto){
        this.puerto = puerto ;
    }

    /**
     * Método que enciende la lámpara con sus características
     */
    public void encender(){
        System.out.println(" Encendiendo lampara de hogar UK con voltaje: " + puerto);
    }

    /**
     * Método que apaga la lámpara con sus características
     */
    public void apagar(){
        System.out.println(" Apagando lampara de hogar UK con voltaje:"+ puerto);
    }


}
