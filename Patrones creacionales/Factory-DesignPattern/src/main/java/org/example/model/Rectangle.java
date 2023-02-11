package org.example.model;

public class Rectangle implements Shape {
    //La clase Rectangle implementa la interfaz Shape y define el método draw()
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
