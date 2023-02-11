package org.alejandroArias.application;

import org.alejandroArias.model.Computer;
import org.alejandroArias.model.ComputerBuilder;

public class Main {
    public static void main(String[] args) {
        /*
            Este tipo de patrón se basa en la programación fluida, donde
            busca evitar crear un objeto y luego hacer setters para operar
            o crear un objeto con un constructor muy largo y tedioso

            Si usaramos el constructor de la clase Computer se vería así:
            Computer computer = new Computer("Dell", "Inspiron 15", "Black", "123456789", "Intel Core i7", "16GB", "1TB", "Windows 10", "15.6", "Logitech");

            Si usaramos los setters se vería así:
            Computer computer = new Computer();
            computer.setBrand("Dell");
            computer.setModel("Inspiron 15");
            computer.setColor("Black");
            computer.setSerialNumber("123456789");


            Pero con el patrón builder se hace de la siguiente manera:
         */
        Computer computer = new ComputerBuilder() //este código es mucho más legible y fácil de entender
                .operatingSystem("Windows 10")
                .color("Black")
                .screen("15.6")
                .serialNumber("123456789")
                .processor("Intel Core i7")
                .ram("16GB")
                .hardDrive("1TB")
                .keyboard("Logitech")
                .build();

        System.out.println("computer = " + computer);

    }
}