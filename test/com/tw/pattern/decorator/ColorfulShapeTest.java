package com.tw.pattern.decorator;

import org.junit.Test;

import static com.tw.pattern.decorator.ShapeColor.GREEN;
import static com.tw.pattern.decorator.ShapeColor.RED;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ColorfulShapeTest {
    @Test
    public void should_draw_colorful_rectangle() throws Exception {
        Shape greenRectangle = new ColorfulShape(new Rectangle(), GREEN);

        String drawingResult = greenRectangle.draw();

        assertThat(drawingResult, is("Drawing rectangle with GREEN color"));
    }

    @Test
    public void should_draw_colorful_circle() throws Exception {
        Shape greenCircle = new ColorfulShape(new Circle(), RED);

        String drawingResult = greenCircle.draw();

        assertThat(drawingResult, is("Drawing circle with RED color"));
    }

}
