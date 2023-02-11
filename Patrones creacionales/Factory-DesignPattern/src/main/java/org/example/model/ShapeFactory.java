package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    // Map of shapes
    //se usa un mapa para almacenar las formas esto permite que se puedan agregar nuevas formas sin modificar el código existente
    private static final Map<String, Shape> shapes = new HashMap<>();

    //se inicializa el mapa con las formas que se quieren crear

    static {
        shapes.put("rectangle", new Rectangle());
        shapes.put("triangle", new Triangle());
        shapes.put("circle", new Circle());
    }

    /**
     * Dado un tipo de forma, devuelve un objeto de esa forma
     * @param shapeType tipo de forma
     * @return objeto de la forma shapeType
     */
    public static Shape getShape(String shapeType) {
        Shape shape = shapes.get(shapeType.toLowerCase()); //se obtiene la forma de la estructura Hashmap
        //operador ternario para retornar la forma o un objeto de tipo Shape
        //si la forma existe se retorna la forma, si no se retorna se usa una lambda para imprimir un mensaje
        return shape != null ? shape : () -> System.out.println("Inside Unknown Shape::draw() method.");
    }



}
