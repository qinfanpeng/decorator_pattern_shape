package com.tw.pattern.decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BasicShapeTest {
    @Test
    public void should_draw_rectangle() throws Exception {
        Shape rectangle = new Rectangle();

        String drawingResult = rectangle.draw();

        assertThat(drawingResult, is("Drawing rectangle"));
    }

    @Test
    public void should_draw_circle() throws Exception {
        Shape circle = new Circle();

        String drawingResult = circle.draw();

        assertThat(drawingResult, is("Drawing circle"));
    }
}
