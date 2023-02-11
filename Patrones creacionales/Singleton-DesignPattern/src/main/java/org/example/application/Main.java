package org.example.application;

import org.example.model.Application;

public class Main {
    public static void main(String[] args) {
        /*
        * Tenemos una clase llamada Application; sin embargo, queremos
        * que esta clase solo se pueda instanciar una sola vez.
        * No quisieramos que se pueda instanciar más de una vez porque
        * no queremos que se puedan crear más de una aplicación al mismo tiempo.
        */

        //llamaríamos al metodo getInstance() de la clase Application
        Application app = Application.getInstance();
        Application app2 = Application.getInstance();

        //app y app2 son la misma instancia de la clase Application
        System.out.println(app);
        System.out.println(app2);

    }
}