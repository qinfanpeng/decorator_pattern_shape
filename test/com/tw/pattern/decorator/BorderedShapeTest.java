package com.tw.pattern.decorator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BorderedShapeTest {
    @Test
    public void should_draw_bordered_rectangle() throws Exception {
        Shape borderedRectangle = new BorderedShape(new Rectangle(), 2);

        String drawingResult = borderedRectangle.draw();

        assertThat(drawingResult, is("Drawing rectangle with 2 times border"));
    }

    @Test
    public void should_draw_bordered_circle() throws Exception {
        Shape borderedCircle = new BorderedShape(new Circle(), 3);

        String drawingResult = borderedCircle.draw();

        assertThat(drawingResult, is("Drawing circle with 3 times border"));
    }
}
