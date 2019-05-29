package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Shapes;

public class FacadePatternDemo {
  public static void main(String[] args) {
    ShapeFacade shapeMaker = new ShapeFacade();
    shapeMaker.draw(Shapes.CIRCLE);
    shapeMaker.draw(Shapes.RECTANGLE);
    shapeMaker.draw(Shapes.SQUARE);
  }
}
