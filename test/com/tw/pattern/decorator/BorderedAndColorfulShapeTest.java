package com.tw.pattern.decorator;

import org.junit.Test;

import static com.tw.pattern.decorator.ShapeColor.*;
import static com.tw.pattern.decorator.ShapeColor.GREEN;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BorderedAndColorfulShapeTest {
    @Test
    public void should_draw_bordered_and_colorful_rectangle() throws Exception {
        Shape borderedRectangle = new BorderedShape(new Rectangle(), 2);
        Shape colorfulBorderedRectangle = new ColorfulShape(borderedRectangle, GREEN);

        String drawingResult = colorfulBorderedRectangle.draw();

        assertThat(drawingResult, is("Drawing rectangle with 2 times border with GREEN color"));
    }

    @Test
    public void should_draw_colorful_and_bordered_circle() throws Exception {
        Shape colorfulCircle = new ColorfulShape(new Circle(), RED);
        Shape borderedColorfulCircle = new BorderedShape(colorfulCircle, 3);

        String drawingResult = borderedColorfulCircle.draw();

        assertThat(drawingResult, is("Drawing circle with RED color with 3 times border"));
    }

}
