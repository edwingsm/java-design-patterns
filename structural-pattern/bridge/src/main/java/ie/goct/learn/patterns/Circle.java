package ie.goct.learn.patterns;

public class Circle extends Shape {

  public Circle(Painter painter){
    super(painter);
  }
  @Override
  public void paintSurface() {
    this.painter.startPainting();
  }
}
