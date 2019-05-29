package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Shape;
import ie.goct.learn.patterns.common.shape.Shapes;

public abstract class AbstractShapeFactory {
  abstract Shape getShape(Shapes shapeType) ;
}

