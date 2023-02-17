package org.alejandroArias.application;

import org.alejandroArias.model.Reproductor;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
           El patrón de diseño State es un patrón de comportamiento que permite a un objeto cambiar su comportamiento
           cuando su estado interno cambia. El objeto parecerá cambiar su clase cuando en realidad solo cambia su estado.
           El patrón State es útil cuando un objeto debe cambiar su comportamiento dependiendo de su estado interno.
           El patrón State permite que un objeto cambie su comportamiento en tiempo de ejecución.
         */



        //Los reproductores de música siempre empiezan en estado detenido
        //El reproductor de música puede estar en estado reproduciendo, pausado o detenido
        //El reproductor de música puede reproducir, pausar o detener
        //El reproductor de música puede cambiar de estado
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(); //se mostrará "Iniciando la reproducción"
        Thread.sleep(1000);
        reproductor.reproducir(); //se mostrará "El reproductor ya está reproduciendo"
        Thread.sleep(1000);
        reproductor.pausar(); //se mostrará "Pausando la reproducción"
        Thread.sleep(1000);
        reproductor.pausar(); //se mostrará "No se puede pausar, ya está pausado"
        Thread.sleep(1000);
        reproductor.detener(); //se mostrará "Deteniendo la reproducción"
        Thread.sleep(1000);
        reproductor.detener(); //se mostrará "No se puede detener, no se está reproduciendo"

    }
}