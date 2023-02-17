package org.alejandroArias.application;

import org.alejandroArias.model.Iterator;
import org.alejandroArias.model.Usuario;
import org.alejandroArias.model.UsuarioCollectionArray;
import org.alejandroArias.model.UsuarioCollectionLinkedList;

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

        Iterator<Usuario> usuarioCollection = new UsuarioCollectionArray(usuarios);
        System.out.println("--------------Iterator de array -----------------");
        while(usuarioCollection.hasNext()){
            Usuario usuario = usuarioCollection.next();
            System.out.println(usuario);
        }

        //El caso anterior es un ejemplo de un iterator que recorre un arreglo.
        //Sin embargo, podemos crear un iterator que recorra un árbol o una linkedList
        //sin tener que ver el código de la estructura de datos.

        Iterator<Usuario> usuarioIterator = new UsuarioCollectionLinkedList();
        usuarioIterator.add(new Usuario("María", "Arias"));
        usuarioIterator.add(new Usuario("Carlos", "Perez"));
        usuarioIterator.add(new Usuario("Camilo", "Gonzalez"));

        System.out.println("--------------Iterator de linkedList-----------------");

        while(usuarioIterator.hasNext()){
            Usuario usuario = usuarioIterator.next();
            System.out.println(usuario);
        }

        /*
            El patrón iterator nos permite recorrer cualquier estructura de datos
            sin importar el tipo de estructura que sea. Usamos una interfaz genérica para
            que pueda ser usada por cualquier tipo de dato.
         */


    }
}