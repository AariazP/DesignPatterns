package org.alejandroArias.application;

import org.alejandroArias.model.*;

public class Main {
    public static void main(String[] args) {

        /*
         * El patrón de diseño Mediator es un patrón de comportamiento que permite
         * reducir las dependencias entre objetos. El patrón de diseño Mediator
         * es una relación de muchos a mucho entre objetos. (Many-to-Many)
         * Funciona de manera que si uno genera un cambio, todos los objetos
         * que estén relacionados con el objeto que generó el cambio, serán
         * notificados y podrán reaccionar a dicho cambio.
         */

        //Debemos crear una clase mediadora, esta será la que se encargue de
        //notificar a los objetos que estén relacionados con el objeto que
        //generó el cambio. "Como si fuera un intermediario"
        MediadorConcreto mediadorConcreto = new MediadorConcreto();

        //Ahora debemos crear los objetos que serán notificados cuando se genere

        Televisor televisor = new Televisor(mediadorConcreto);
        Satelite satelite = new Satelite(mediadorConcreto);
        Radio radio = new Radio(mediadorConcreto);

        //Ahora debemos agregar los objetos a la clase mediadora

        mediadorConcreto.agregar(televisor);
        mediadorConcreto.agregar(satelite);
        mediadorConcreto.agregar(radio);

        //Ahora debemos enviar un mensaje desde el satélite
        satelite.enviar(" 'Hola, soy el satélite' ");

        //si solo ejecutamos el programa, veremos que el satélite envía un mensaje
        System.out.println();
        //ahora podríamos enviar un mensaje desde el radio

        radio.enviar(" 'Hola, soy el radio' ");


    }
}