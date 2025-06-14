package org.LLDDesignPatterns.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape obj= shapeFactory.getShape("Circle");
        obj.draw();
    }
}
