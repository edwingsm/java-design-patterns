package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Shape;
import ie.goct.learn.patterns.common.shape.Shapes;

public class RoundedShapeFactory extends AbstractShapeFactory {
  @Override
  public Shape getShape(Shapes shapeType) {
    if (shapeType.equals(Shapes.RECTANGLE)) {
      return new RoundedRectangle();
    } else if (shapeType.equals(Shapes.SQUARE)) {
      return new RoundedSquare();
    }
    return null;
  }
}
