package org.example.model;

public class Triangle implements Shape {
    //La clase Triangle implementa la interfaz Shape y define el método draw()
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method.");
    }
}

