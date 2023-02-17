package org.alejandroArias.model;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto{

    //lista de los dispositivos que se van a comunicar con la central
    //que está representada por esta clase
    private  List<Mediador> mediadors;

    public MediadorConcreto() {
        this.mediadors = new ArrayList<>();
    }

    public List<Mediador> getMediadors() {
        return mediadors;
    }

    public void setMediadors(List<Mediador> mediadors) {
        this.mediadors = mediadors;
    }

    /**
     * Método que envía un mensaje a todos los dispositivos,
     * excepto al que lo envió
     * @param mensaje mensaje a enviar
     * @param mediador dispositivo que envió el mensaje
     */
    public void enviar(String mensaje, Mediador mediador) {

        for (Mediador mediadorAux : mediadors) {
            if(mediadorAux != mediador) mediadorAux.recibir(mensaje); //verifica que no sea el mismo dispositivo
        }
    }

    public void agregar(Mediador mediador){
        mediadors.add(mediador);
    }
}
