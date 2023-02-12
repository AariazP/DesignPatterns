package org.alejandroArias.model;

public class LamparaHogar implements Enchufable {

    /*
     * Lampara clásica que no tiene problema para ser enchufada en cualquier parte
     * de Latinoamérica porque implementa la interfaz Enchufable
     */

    /**
     * Método que se encarga de enchufar la lámpara
     */
    @Override
    public void enchufar() {
        System.out.println(" Enchufando lámpara de hogar " );
    }

    /**
     * Método que se encarga de desenchufar la lámpara
     */

    @Override
    public void desenchufar() {
        System.out.println(" Desenchufando lámpara de hogar " );
    }

}
