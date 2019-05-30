package ie.goct.learn.patterns;

public class Bike extends AbstractVehicle{

  public Bike(String id){
    super(id);
    this.type="Bike";
  }

  @Override
  void start() {
    System.out.println("Biker");
  }
}
