package org.alejandroArias.model;

public class Televisor implements Mediador{

    //Central a la que se comunicará cuando se envíe un mensaje
    private MediadorConcreto mediadorConcreto;

    public Televisor(MediadorConcreto mediadorConcreto) {
        this.mediadorConcreto = mediadorConcreto;
    }
    /**
     * Método que envía un mensaje a la central
     * es implementado de la interfaz Mediador
     * @param mensaje mensaje a enviar
     */
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando desde el Televisor el mensaje " + mensaje);
        mediadorConcreto.enviar(mensaje, this);
    }
    /**
     * Método que recibe un mensaje de la central
     * @param mensaje mensaje a recibir
     */
    @Override
    public void recibir(String mensaje) {
        System.out.println("Recibiendo desde Televisor el mensaje " + mensaje);
    }

    public MediadorConcreto getMediadorConcreto() {
        return mediadorConcreto;
    }

    public void setMediadorConcreto(MediadorConcreto mediadorConcreto) {
        this.mediadorConcreto = mediadorConcreto;
    }
}
