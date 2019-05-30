package ie.goct.learn.patterns;

public class Truck extends AbstractVehicle {

  public Truck(String id){
    super(id);
    this.type="Truck";
  }

  @Override
  void start() {
    System.out.println("Truck Started");
  }
}
