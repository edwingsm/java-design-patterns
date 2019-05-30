package ie.goct.learn.patterns;

public class PrototypePatternDemo {

  public static void main(String[] args) {
    VehicleCache.loadCache();

    AbstractVehicle car =  VehicleCache.getVehicle("1");
    System.out.println("Vehicle : " + car.getType());

    AbstractVehicle truck = VehicleCache.getVehicle("2");
    System.out.println("Vehicle : " + truck.getType());

    AbstractVehicle bike = VehicleCache.getVehicle("3");
    System.out.println("Vehicle : " + bike.getType());
  }
}
