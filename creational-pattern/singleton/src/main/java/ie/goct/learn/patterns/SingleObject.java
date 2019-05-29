package ie.goct.learn.patterns;


import java.util.Objects;

public class SingleObject {

  private String message;

  private static SingleObject instance = null;

  private SingleObject(String message){
    this.message =message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleObject that = (SingleObject) o;
    return message.equals(that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  public String getMessage() {
    return message;
  }

  //Get the only object available
  synchronized public static SingleObject getInstance(){
    if(instance ==null)
      return instance = new SingleObject("Initialized By singleton Call");

    return instance;
  }


}
