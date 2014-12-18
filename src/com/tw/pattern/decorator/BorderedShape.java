package com.tw.pattern.decorator;

public class BorderedShape extends SpecialShape {
    private int times;

    public BorderedShape(Shape shape, int times) {
        super(shape);
        this.times = times;
    }

    @Override
    public String draw() {
        return super.draw() + " with " + times + " times border" ;
    }
}
