package ie.goct.learn.patterns;

import ie.goct.learn.patterns.common.shape.Shape;

public class RoundedSquare implements Shape {
  @Override
  public void draw() {
    System.out.println("Inside RoundedSquare::draw() method.");
  }
}
