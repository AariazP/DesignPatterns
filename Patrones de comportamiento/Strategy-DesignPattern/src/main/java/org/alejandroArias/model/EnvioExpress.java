package org.alejandroArias.model;

public class EnvioExpress implements EstrategiaEnvio {

    @Override
    public void calcularCostoEnvio(double peso, double distancia) {
        double costoEnvio = peso * distancia * 0.15;
        System.out.println("El costo del envio es: " + costoEnvio);
    }

}
