package org.alejandroArias.application;

import org.alejandroArias.model.*;

public class Main {
    public static void main(String[] args) {
        /*
            Imaginemos que trabajamos para un cine y somos los encargados
            de la administración de las películas que se proyectan en él.
            También somos quienes nos encargamos de la administración del sonido,
            luces y demás cosas que se necesitan para que la película se proyecte

            Ahora supongamos que alguien nos pregunta ¿cuál es nuestro trabajo?
            Una manera de responder es decir que somos los encargados de:

            -encender las luces
            -encender el sonido
            -encender la proyección
            -apagar las luces
            -apagar el sonido
            -apagar la proyección

            Sin embargo, esta no es la respuesta que daríamos porque es demasiado
            larga repetitiva y complejo de entender. Por lo tanto, la respuesta
            más sencilla podría ser: somos los encargados de la administración del cine.

            Parece simple la respuesta, pero lo que estamos haciendo es englobar
            todas las tareas que realizamos en una sola tarea, la administración.
            Eso es lo que plantea el patrón de diseño Facade, que es un patrón
            estructural que nos permite englobar una serie de clases en una sola
            clase que nos permita acceder a todas las funcionalidades de las clases.
            No tenemos que preocuparnos por cómo funcionan las clases, únicamente
            tenemos que preocuparnos de cómo acceder a ellas.

         */


        /*

            En resumen, aunque lo anterior parece un poco complejo, lo que realmente está pasando es
            que no queremos hacer algo del tipo
            SistemaSonido sistemaSonido = new SistemaSonido();
            sistemaSonido.encender();
            sistemaSonido.ajustarVolumen();
            sistemaSonido.apagar();
            SistemaProyeccion sistemaProyeccion = new SistemaProyeccion();
            sistemaProyeccion.encender();
            sistemaProyeccion.reproducirPelicula();
            sistemaProyeccion.apagar();
            SistemaLuces sistemaLuces = new SistemaLuces();
            sistemaLuces.encender();
            sistemaLuces.ajustarBrillo();
            sistemaLuces.apagar();

            etc...

            Realmente la fachada va a ocultar la complejidad de las clases que la componen
            y solo llamará a los métodos que necesitemos.

            */


        SistemaLuces sistemaLuces = new SistemaLuces();
        SistemaSonido sistemaSonido = new SistemaSonido("Panasonic", "Viera", "TX-55FZ952B");
        SistemaProyeccion sistemaProyeccion = new SistemaProyeccion("HD-QUALITY", "Samsung", "2020");
        Sala sala = new Sala(1, 70, "2D");
        Pelicula pelicula = new Pelicula("El señor de los anillos", "Fantasía", "2h30m", "Familiar", "Peter Jackson");



        Cine cine = new Cine(pelicula, sala, sistemaProyeccion, sistemaSonido, sistemaLuces);

        //aquí es donde se aplica el patrón de diseño Facade
        //simplemente llamamos al método encenderCine de la clase Cine
        //y este método se encarga de llamar a los métodos de las clases

        cine.encenderCine();


        //Solo llamamos los metodos, no nos preocupamos por como funcionan

        cine.reproducirPelicula();

        //Cada uno de los métodos de la clase Cine se encarga de llamar a los métodos de las clases

        cine.detenerPelicula();



    }
}