package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Circle;
import ie.goct.learn.patterns.common.shape.Rectangle;
import ie.goct.learn.patterns.common.shape.Shape;
import ie.goct.learn.patterns.common.shape.Shapes;
import ie.goct.learn.patterns.common.shape.Square;

public class ShapeFacade {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
    }

    public void draw (Shapes shapes){
      switch (shapes){
        case CIRCLE:
          drawCircle();
          break;
        case SQUARE:
          drawSquare();
          break;
        case RECTANGLE:
          drawRectangle();
          break;
        default:
          break;
      }
    }

    private void drawCircle(){
      circle.draw();
    }
    private void drawRectangle(){
      rectangle.draw();
    }
    private void drawSquare(){
      square.draw();
    }
}

