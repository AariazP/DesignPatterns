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

        Envio envioEconomico = new Envio(new EnvioEconomico());

        envioEconomico.calcularCostoEnvio(1000, 1000);

        Envio envioExpress = new Envio(new EnvioExpress());

        envioExpress.calcularCostoEnvio(1000, 1000);

    }
}