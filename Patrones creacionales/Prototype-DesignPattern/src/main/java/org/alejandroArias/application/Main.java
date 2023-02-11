package org.alejandroArias.application;

import org.alejandroArias.model.Carro;

public class Main {
    public static void main(String[] args) {

     /*
         El patrón de diseño prototype es un patrón de creación que permite la creación de objetos a partir de un prototipo original.
         Es decir, el patrón de diseño prototype permite crear objetos a partir de un objeto original, sin necesidad de conocer la clase de los objetos que se crean.
         La clase de los objetos que se generan se obtiene clonando el prototipo original.
      */

        // Creamos un objeto de tipo Carro

        Carro carro = new Carro("Toyota", "Corolla", "Blanco", "ABC-123");

        //ahora imaginemos que tenemos que crear 1000 carros iguales al anterior, pero con diferentes placas
        //para esto usamos el patrón de diseño prototype

        //creamos un objeto de tipo Carro que será el prototipo
        Carro carroPrototype = new Carro("Toyota", "Corolla", "Blanco", "ABC-123");

        //creamos un arreglo de 1000 carros

        Carro[] carros = new Carro[1000];

        //creamos un bucle for para crear los 1000 carros

        for (int i = 0; i < carros.length; i++) {
            //creamos un objeto de tipo Carro que será el clon del prototipo
            Carro carroClon = carroPrototype.clone();
            //le asignamos una placa diferente al clon
            carroClon.setPlaca("ABC-" + i);
            //agregamos el clon al arreglo de carros
            carros[i] = carroClon;
        }

        //imprimimos los carros
        for (Carro carro1 : carros) {
            System.out.println(carro1);
        }

        //ese es el funcionamiento del patrón de diseño prototype



    }
}