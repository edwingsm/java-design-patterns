package ie.goct.learn.patterns;

public  abstract class Shape {
  protected Painter painter;

  protected Shape(Painter painter){
    this.painter = painter;
  }
  public abstract void paintSurface();
}
