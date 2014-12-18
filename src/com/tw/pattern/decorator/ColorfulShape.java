package com.tw.pattern.decorator;

public class ColorfulShape extends SpecialShape {
    private final ShapeColor color;

    public ColorfulShape(Shape shape, ShapeColor color) {
        super(shape);
        this.color = color;
    }

    @Override
    public String draw() {
        return super.draw() + " with " + color + " color";
    }
}
