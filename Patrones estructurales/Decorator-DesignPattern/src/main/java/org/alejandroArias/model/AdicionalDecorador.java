package org.alejandroArias.model;

public abstract class AdicionalDecorador implements Bebida{

    /*
        Esta clase es casi que opcional, pero es para que no se repita el código
        de los decoradores, ya que todos ellos tienen un atributo de tipo Bebida
        que es la clase que queremos decorar. Todos los decoradores pueden simplemente
        heredar de esta clase y ya no tendrían que implementar el método getDescripcion()
        porque estos métodos lo heredaría de esta clase.

        Simplemente, queremos obtener lo abstracto que es lo común a todos los decoradores
        y en este caso es la descripción de la bebida y la bebida que queremos decorar.

     */


    protected Bebida bebida; // La bebida que queremos decorar


    /*
        Este constructor recibe la bebida que queremos decorar y la asigna al atributo
        de esta manera cuando los constructores de los decoradores se ejecuten, se ejecutará
        este constructor y se asignará la bebida que queremos decorar.
     */

    public AdicionalDecorador(Bebida bebida) {
        this.bebida = bebida;
    }

    /*
        Este método es abstracto porque cada decorador tendrá una descripción diferente
        y, por lo tanto, cada decorador tendrá que implementar este método.
     */

    @Override
    public abstract String getDescripcion();
}
