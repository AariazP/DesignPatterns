package org.example.model;
public class Application {

    /*
        Creamos una variable de tipo Application
        esta variable será la instancia de la clase Application.
        Será la única instancia de la clase Application.
     */
    private static Application instance = null;

    /*
        Creamos un constructor privado para que no se pueda instanciar
        la clase Application desde fuera de la clase.
        Es decir, en ningún lugar se puede hacer Application app = new Application();
     */
    private Application() {}


    public static Application getInstance() {
        /*
            Si la variable instance es null, quiere decir que no se ha instanciado
            la clase Application, por lo tanto, se instancia la clase Application
            y se guarda en la variable instance.
         */
        if (instance == null) {
            instance = new Application();
        }

        /*
            Si la variable instance no es null, quiere decir que ya se ha instanciado
            la clase Application, por lo tanto, se retorna la instancia de la clase
            Application que se encuentra en la variable instance.
         */
        return instance;
    }
}
