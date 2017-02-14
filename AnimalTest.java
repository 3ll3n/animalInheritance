import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class AnimalTest{
  Animal animal;
  Mammal mammal;
  Human human;
  Chimpanzee chimpanzee;

  @Before
  public void before(){
    animal = new Animal();
    mammal = new Mammal();
    human = new Human();
    chimpanzee = new Chimpanzee();
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

  @Test
  public void testMammalCanSpeak(){
    assertEquals("I can speak", mammal.canSpeak());
  }

}