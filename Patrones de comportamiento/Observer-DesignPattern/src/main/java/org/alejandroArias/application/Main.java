package org.alejandroArias.application;

import org.alejandroArias.model.Emisor;
import org.alejandroArias.model.Emisora;
import org.alejandroArias.model.Oyente;

public class Main {
    public static void main(String[] args) {
        //En este caso la clase Emisora implementa la interfaz Emisor
        //Es quien se encarga de emitir el mensaje y que contiene el oyente
        Emisora emisora = new Emisora();
        //Se agregan los oyentes a la emisora
        emisora.agregarReceptor(new Oyente("Oyente 1"));
        emisora.agregarReceptor(new Oyente("Oyente 2"));
        emisora.agregarReceptor(new Oyente("Oyente 3"));
        emisora.agregarReceptor(new Oyente("Oyente 4"));
        emisora.agregarReceptor(new Oyente("Oyente 5"));
        //Cuando se emite un mensaje, se recorre la lista de oyentes y se les envía el mensaje
        emisora.emitir("Hola mundo!");

        /*
          En resumen, el patrón observer es un patrón de diseño que permite que un objeto
          se comunique con otros objetos sin que estos sepan entre sí.
          El objeto que se comunica con los demás es el emisor y los objetos que reciben
          el mensaje son los receptores.
         */

    }
}