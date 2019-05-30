package ie.goct.learn.patterns;

public class BridgePatternDemo {

  public static void main(String[] args) {
    Shape redCircle = new Circle( new RedPainter());
    Shape greenCircle = new Circle( new GreenPainter());

    redCircle.paintSurface();
    greenCircle.paintSurface();
  }

}
