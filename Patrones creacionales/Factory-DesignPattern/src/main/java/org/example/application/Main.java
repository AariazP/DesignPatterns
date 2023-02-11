package org.example.application;

import org.example.model.Shape;
import org.example.model.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        /*
            Este patrón de diseño es muy útil cuando se tiene que crear objetos de diferentes tipos
            y se quiere que todos tengan un método en común.
            En este caso, todos los objetos generados por la factory tienen el método draw()
            La ventaja del patrón es que con solo pasar un String con el nombre del objeto
            la fábrica genera el objeto y lo devuelve.

            En este caso, la fábrica es la clase ShapeFactory
            Esta clase crea figuras de diferentes tipos, pero todas tienen el método draw()
            La fábrica recibe un String con el nombre de la figura que se quiere crear
            y devuelve un objeto de tipo Shape
         */

        Shape shape = ShapeFactory.getShape("CIRCLE"); //La factory crea un objeto de tipo Shape
        shape.draw(); //No importa que tipo de objeto sea, siempre se llama al método draw()
        //el metodo draw es propio de la interfaz Shape
    }
}