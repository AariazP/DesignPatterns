package org.alejandroArias.application;

import org.alejandroArias.model.Bebida;
import org.alejandroArias.model.Cafe;
import org.alejandroArias.model.Endulzante;
import org.alejandroArias.model.ShotEspresso;

public class Main {
    public static void main(String[] args) {

        /*
            Imaginemos que estamos trabajando en un café y llegan clientes con diferentes gustos y necesidades.
            A veces quieren un cafe simplemente, eso sería instanciar un objeto de tipo Cafe y no habría más.
            Sin embargo, a veces quieren un cafe con un shot de espresso, o un cafe con un shot de espresso y endulzante.
            Para esto, podemos utilizar el patrón de diseño Decorator, que nos permite agregar funcionalidades a un objeto
            sin tener que modificarlo, ni obligarlo a que herede. Si usaramos la herencia y suponiendo que ahora tenemos 4
            (cafe, cafe con shot de espresso, cafe con endulzante, cafe con shot de espresso y endulzante)
            combinaciones de cafe, tendríamos que crear 4 clases que hereden de Cafe, y cada una de ellas tendría que venir con
            la combinación necesaria, es decir, instanciar justamente esta combinación. Será un problema porque si en un futuro
            agregamos nuevos tipos de café tendremos que producir nuevas clases con las combinaciones necesarias.

            El patrón Decorator nos permite agregar funcionalidades a un objeto sin tener que modificarlo, ni obligarlo a que herede.
            En palabras simples, crear un café y si queremos agregarle un shot de espresso, lo agregamos, si queremos agregarle
            endulzante, lo agregamos, si queremos agregarle un shot de espresso y endulzante, lo agregamos, y así sucesivamente.
            Es decir, al café le vamos agregando decoraciones con las cosas que el cliente quiera.
         */

        Bebida cafe = new Cafe();  //Este sería el café simple, sin endulzante ni shot de espresso

        /*
            Si el cliente solo quiere un café, no hacemos nada, simplemente lo servimos.
            Si el cliente quiere un café con un shot de espresso, lo agregamos.
         */
        //cafe = new ShotEspresso(cafe);

        /*
            Gracias a la interfaz Bebida, podemos hacer que el código sea más flexible y que no dependa de la clase Cafe.
            Si en un futuro creamos una clase que herede de Bebida, por ejemplo, un Chocolate, y queremos que el cliente
            pueda pedir un chocolate con un shot de espresso, podemos hacerlo sin tener que modificar el código.

            Ahora supongamos que el cliente cambió de opinión y que además de un shot de espresso, quiere un endulzante.
            Podemos agregarlo sin tener que modificar el código.

         */

        cafe = new Endulzante(cafe); // agregamos al endulzante al café con shot de espresso

        /*
            Esto funcionaría como una recursividad, ya que el endulzante tiene un atributo de tipo Bebida, que es el café con
            shot de espresso, y el café con shot de espresso tiene un atributo de tipo Bebida, que es el café simple.
            Funciona como una matroska, donde cada objeto es una matroska que contiene otro objeto, y así sucesivamente.
         */


        System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());


        /*
            El patrón decorator es muy útil cuando tenemos que agregar funcionalidades a un objeto sin tener que modificarlo,

         */

    }
}