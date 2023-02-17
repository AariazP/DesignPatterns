package org.alejandroArias.model;

public interface Iterator<T>{
    /*
        Este es el patrón iterator, el cual nos permite recorrer
        cualquier estructura de datos sin importar el tipo de
        estructura que sea. Usamos una interfaz genérica para
        que pueda ser usada por cualquier tipo de dato.
     */
     boolean hasNext();
     T next();
     void add(T t);
}
