package org.alejandroArias.model;

public class ShotEspresso extends AdicionalDecorador {

    /*
      Esta clase es un decorador concreto, que extiende de AdicionalDecorador
      y, por lo tanto, debe implementar el método getDescripcion() y getCosto()
      que son abstractos en la clase AdicionalDecorador.

      En este caso definimos que queremos agregarle a una bebida. ES IMPORTANTE darnos cuenta de que el atributo
      bebido es de tipo Bebida, es decir que depende la implementación de la interfaz. Evitando acoplamientos.
      Cualquier objeto que implemente la interfaz Bebida puede ser decorado con un shot de espresso.
     */

    /**
     * Este constructor recibe la bebida que queremos decorar y la asigna al atributo
     * @param bebida Bebida que queremos decorar
     */
    public ShotEspresso(Bebida bebida) {
        super(bebida);
    }

    /**
     * Este método nos devuelve la descripción concreta del shot de espresso
     * @return String con la descripción del shot de espresso
     */
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Shot de Espresso";
    }

    /**
     * Este método nos devuelve el costo concreto del shot de espresso
     * @return double con el costo del shot de espresso
     */
    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.5;
    }

}
