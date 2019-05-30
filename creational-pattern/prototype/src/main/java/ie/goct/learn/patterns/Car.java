package ie.goct.learn.patterns;

public class Car extends AbstractVehicle {

  public Car(String id){
    super(id);
    this.type ="Car";
  }

  @Override
  void start() {
    System.out.println("Car Started");
  }
}
