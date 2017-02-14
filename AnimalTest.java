import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class AnimalTest{
  Animal animal;
  Mammal mammal;

  @Before
  public void before(){
    animal = new Animal();
    mammal = new Mammal();
  }

  @Test
  public void testAnimalCanEat(){
    assertEquals("I can eat", animal.canEat());
  }

  @Test
  public void testAnimalCanBreathe(){
    assertEquals("I can breathe", animal.canBreathe());
  }

  @Test
  public void testMammalCanBrushHair(){
    assertEquals("I can brush my hair", mammal.canBrush());
  }

}