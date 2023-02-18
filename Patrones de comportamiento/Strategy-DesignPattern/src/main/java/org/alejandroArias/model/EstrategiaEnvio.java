package org.alejandroArias.model;

public interface EstrategiaEnvio {

    //Calcula el costo del envio de un paquete con una estrategia específica
    void calcularCostoEnvio(double peso, double distancia);
}
