import com.tw.pattern.decorator.*;

import static com.tw.pattern.decorator.ShapeColor.GREEN;
import static com.tw.pattern.decorator.ShapeColor.RED;

public class Main {

    public static void main(String[] args) {
        Shape redRectangle = new ColorfulShape(new Rectangle(), RED);
        System.out.println(redRectangle.draw());

        ColorfulShape greenCircle = new ColorfulShape(new Circle(), GREEN);
        Shape borderedGreenCircle = new BorderedShape(greenCircle, 2);
        System.out.println(borderedGreenCircle.draw());

        BorderedShape borderedShape = new BorderedShape(new Circle(), 2);
        Shape greenBorderedGreenCircle = new ColorfulShape(borderedShape, GREEN);
        System.out.println(greenBorderedGreenCircle.draw());

    }
}
