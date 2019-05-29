package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Shape;
import ie.goct.learn.patterns.common.shape.Shapes;

public class AbstractFactoryPatternDemo  {
  public static void main(String[] args) {
    //get normal shape factory
    AbstractShapeFactory shapeFactory = FactoryProducer.getFactory(false);

    Shape rectangle = shapeFactory.getShape(Shapes.RECTANGLE);
    rectangle.draw();

    Shape square = shapeFactory.getShape(Shapes.SQUARE);
    square.draw();

    //get rounded shape factory
    AbstractShapeFactory roundedFactory = FactoryProducer.getFactory(true);

    Shape roundedRectangle = roundedFactory.getShape(Shapes.RECTANGLE);
    roundedRectangle.draw();

    Shape  roundedSquare= roundedFactory.getShape(Shapes.SQUARE);
    roundedSquare.draw();

  }
}
