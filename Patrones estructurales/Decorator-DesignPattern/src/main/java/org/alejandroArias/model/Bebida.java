package org.alejandroArias.model;

public interface Bebida {
    /*
         Es importante que creemos esta interfaz, el objetivo es que cuando creemos un café este la implemente
         y si en un futuro queremos agregar un chocolate, un té, un café con leche, etc. solo debemos crear una clase
         que herede de Bebida y que implemente los métodos de esta interfaz.

         Es decir, para que funcione el patrón decorator basta con que la clase que queremos decorar implemente esta interfaz
         y ya podríamos agregarle decoraciones a nuestro chocolate, a nuestro té, a nuestro café con leche, etc. Con endulzante,
         con shot de espresso, etc.

     */


    /**
     * Este método nos devuelve la descripción de la bebida
     * @return String con la descripción de la bebida
     */

    String getDescripcion();


    /**
     * Este método nos devuelve el costo de la bebida
     * @return double con el costo de la bebida
     */

    double getCosto();

}
