package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Rectangle;
import ie.goct.learn.patterns.common.shape.Shape;
import ie.goct.learn.patterns.common.shape.Shapes;
import ie.goct.learn.patterns.common.shape.Square;

public class ShapeFactory extends AbstractShapeFactory {
  @Override
  public Shape getShape(Shapes shapeType){
    if(shapeType.equals(Shapes.RECTANGLE)){
      return new Rectangle();
    }else  if(shapeType.equals(Shapes.SQUARE)){
      return new Square();
    }
    return null;
  }
}
