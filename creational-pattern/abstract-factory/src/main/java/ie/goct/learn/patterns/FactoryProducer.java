package ie.goct.learn.patterns;

public class FactoryProducer {

  public static AbstractShapeFactory getFactory(boolean rounded){
    if(rounded){
      return new RoundedShapeFactory();
    }else{
      return new ShapeFactory();
    }
  }

}
