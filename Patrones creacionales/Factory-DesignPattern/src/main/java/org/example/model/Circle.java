package org.example.model;

public class Circle implements Shape {
    //La clase Circle implementa la interfaz Shape y define el método draw()
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
