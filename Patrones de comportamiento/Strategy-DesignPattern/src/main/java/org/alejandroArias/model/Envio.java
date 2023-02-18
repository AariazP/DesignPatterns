package org.alejandroArias.model;

public class Envio {

    /*
        Representa un envío con una estrategia de envío específica
     */
    private EstrategiaEnvio estrategiaEnvio;

    public Envio(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    /**
     * Calcula el costo del envio de un paquete con una estrategia especifica
     * @param peso peso del paquete
     * @param distancia distancia a recorrer
     */
    public void calcularCostoEnvio(double peso, double distancia) {
         estrategiaEnvio.calcularCostoEnvio(peso, distancia);
    }

}
