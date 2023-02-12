package org.alejandroArias.model;

public class LamparaHogarUKAdapter implements Enchufable{


    /**
     * Esta clase funciona con un Wrapper o envoltorio, es decir, que se crea una instancia de la clase que se quiere adaptar
     * y se le delega la responsabilidad de realizar las acciones que se requieren.
     * En este caso, la clase LamparaHogarUKAdapter se encarga de encender y apagar la lámpara de UK
     * Esto nos permite que aunque LamparaHogarUK no implemente la interfaz Enchufable, podamos usarla
     * porque su adaptador si la implementa
     */
    private LamparaHogarUK lamparaHogarUK; //instancia de la clase que se quiere adaptar


    /**
     * Constructor que crea una instancia de la clase que se quiere adaptar
     */
    public LamparaHogarUKAdapter(){
        this.lamparaHogarUK = new LamparaHogarUK("-^-");
    }

    /**
     * Método que enciende la lámpara de UK
     */
    public void enchufar(){
        lamparaHogarUK.encender();
    }
    /**
     * Método que apaga la lámpara de UK
     */
    public void desenchufar(){
        lamparaHogarUK.apagar();
    }

    //getters y setters

    public LamparaHogarUK getLamparaHogarUK() {
        return lamparaHogarUK;
    }

    public void setLamparaHogarUK(LamparaHogarUK lamparaHogarUK) {
        this.lamparaHogarUK = lamparaHogarUK;
    }
}
