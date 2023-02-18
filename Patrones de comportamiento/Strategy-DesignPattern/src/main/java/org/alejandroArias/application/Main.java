package org.alejandroArias.application;

import org.alejandroArias.model.Envio;
import org.alejandroArias.model.EnvioEconomico;
import org.alejandroArias.model.EnvioExpress;

public class Main {
    public static void main(String[] args) {
        /*
         El patrón Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos,
         poner cada uno de ellos en una clase separada y hacer sus objetos intercambiables.
         */

        //El envío puede ser económico o express
        //Simplemente se instancia un objeto de tipo Envio y se le pasa como parámetro un objeto de tipo EnvioEconomic o EnvioExpress


        //Si deseo calcular el costo de un envío económico
        Envio envioEconomico = new Envio(new EnvioEconomico());
        envioEconomico.calcularCostoEnvio(1000, 1000);
        //Si deseo calcular el costo de un envío express
        Envio envioExpress = new Envio(new EnvioExpress());
        envioExpress.calcularCostoEnvio(1000, 1000);

    }
}