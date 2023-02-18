package org.alejandroArias.model;

public class EnvioEconomico implements EstrategiaEnvio {
    /**
     * Contiene la lógica para calcular el costo del envio de un paquete con modalidad
     * económica
     *
     */
    @Override
    public void calcularCostoEnvio(double peso, double distancia) {
        double costoEnvio = peso * distancia * 0.01;
        System.out.println("El costo del envio es: " + costoEnvio);
    }

}
