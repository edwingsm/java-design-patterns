package ie.goct.learn.patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonObjectTest {

  @DisplayName("Single test successful")
  @Test
  void testObjectCreation() {
    SingleObject singleObject_Once = SingleObject.getInstance();
    SingleObject singleObject_twice = SingleObject.getInstance();
    Assertions.assertEquals(singleObject_Once,singleObject_twice);
  }

}
