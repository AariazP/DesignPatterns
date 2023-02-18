package org.alejandroArias.model;

public class EnvioExpress implements EstrategiaEnvio {
    /**
     * Contiene un comportamiento para calcular el costo del envio de un paquete
     * con modalidad express
     * @param peso peso del paquete
     * @param distancia distancia a recorrer
     */
    @Override
    public void calcularCostoEnvio(double peso, double distancia) {
        double costoEnvio = peso * distancia * 0.15;
        System.out.println("El costo del envio es: " + costoEnvio);
    }

}
