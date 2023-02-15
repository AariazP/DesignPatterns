package org.alejandroArias.application;

import org.alejandroArias.model.Usuario;
import org.alejandroArias.model.UsuarioCollectionArray;

public class Main {
    public static void main(String[] args) {

        /*
            Si tienes una estructura de datos como un arreglo,
            o una lista es normal usar un for para recorrerlos.
            El problema comienza cuando ahora ya no queremos utilizar
            una lista por motivos de diseño de sistema. Si tenemos una lista
            acoplada al codigo no nos será fácil cambiarlo por una linkedList
            o un árbol y debemos ir a cambiar el código que ya tenemos.

            El patrón iterator viene a solucionar este problema.
            Simplemente usando una interfaz iterator con los métodos comunes


         */

        Usuario[] usuarios = new Usuario[3];
        usuarios[0] = new Usuario("Alejandro", "Arias");
        usuarios[1] = new Usuario("Juan", "Perez");
        usuarios[2] = new Usuario("Pedro", "Gonzalez");

        UsuarioCollectionArray usuarioCollection = new UsuarioCollectionArray(usuarios);

        while(usuarioCollection.hasNext()){
            Usuario usuario = usuarioCollection.next();
            System.out.println(usuario.getNombre() + " " + usuario.getApellido());
        }

        //El caso anterior es un ejemplo de un iterator que recorre un arreglo.
        //Sin embargo, podemos crear un iterator que recorra un árbol o una linkedList
        //sin tener que ver el código de la estructura de datos.








    }
}