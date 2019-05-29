package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Circle;
import ie.goct.learn.patterns.common.shape.Rectangle;
import ie.goct.learn.patterns.common.shape.Shape;
import ie.goct.learn.patterns.common.shape.Shapes;
import ie.goct.learn.patterns.common.shape.Square;

public class ShapeFactory {

  // use getShape method to get object of type shape
  public Shape getShape(Shapes shapeType) {
    Shape shape = null;

    if (shapeType == null) {
      return shape;
    }

    switch (shapeType) {
      case CIRCLE:
        shape = new Circle();
        break;
      case SQUARE:
        shape = new Square();
        break;
      case RECTANGLE:
        shape = new Rectangle();
        break;
      default:
        break;
    }
    return shape;
  }
}
