package ie.goct.learn.patterns;

import java.util.Hashtable;

public class VehicleCache {

  private static Hashtable<String, AbstractVehicle> VehicleCache = new Hashtable<String, AbstractVehicle>();

  public static AbstractVehicle getVehicle(String shapeId) {
    AbstractVehicle cachedShape = VehicleCache.get(shapeId);
    return (AbstractVehicle) cachedShape.clone();
  }

  // Assume for each vehicle object is coming form external source like DB or remote server
  // vehicleCache.put(key, Vehicle);

  public static void loadCache() {
    final Car car = new Car("1");
    final Truck truck =new Truck("2");
    final Bike bike =new Bike("3");

    VehicleCache.put(car.getId(),car);
    VehicleCache.put(truck.getId(),truck);
    VehicleCache.put(bike.getId(), bike);
  }

}
