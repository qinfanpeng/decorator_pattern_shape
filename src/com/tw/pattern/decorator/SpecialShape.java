package com.tw.pattern.decorator;

public class SpecialShape implements Shape {
    protected Shape shape;

    protected SpecialShape(Shape shape) {
        this.shape = shape;
    }

    public String draw() {
        return this.shape.draw();
    }
}
