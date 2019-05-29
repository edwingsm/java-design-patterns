package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Shape;
import ie.goct.learn.patterns.common.shape.Shapes;

public class FactoryPatternDemo {

  public static void main(String[] args) {
    final ShapeFactory shapeFactory = new ShapeFactory();

    final Shape circle = shapeFactory.getShape(Shapes.CIRCLE);
    circle.draw();

    final Shape rectangle = shapeFactory.getShape(Shapes.RECTANGLE);
    rectangle.draw();

    final Shape square = shapeFactory.getShape(Shapes.SQUARE);
    square.draw();
  }
}
