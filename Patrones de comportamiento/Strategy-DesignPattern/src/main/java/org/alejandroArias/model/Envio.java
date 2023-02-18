package org.alejandroArias.model;

public class Envio {


    private EstrategiaEnvio estrategiaEnvio;

    public Envio(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }


    public void calcularCostoEnvio(double peso, double distancia) {
         estrategiaEnvio.calcularCostoEnvio(peso, distancia);
    }

}
