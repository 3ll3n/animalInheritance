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
  public void testMammalCanEat(){
    assertEquals("I can eat", mammal.canEat());
  }

  @Test
  public void testMammalCanBreathe(){
    assertEquals("I can breathe", mammal.canBreathe());
  }

  @Test
  public void testMammalCanBrushHair(){
    assertEquals("I can brush my hair", mammal.canBrush());
  }

  @Test
  public void testHumanCanEat(){
    assertEquals("I can eat", human.canEat());
  }

  @Test
  public void testHumanCanSpeak(){
    assertEquals("I can speak", human.canSpeak());
  }

  @Test
  public void testHumanCanBreathe(){
    assertEquals("I can breathe", human.canBreathe());
  }

  @Test
  public void testHumanCanBrushHair(){
    assertEquals("I can brush my hair", human.canBrush());
  }

  // test chimpanzee can speak, can brush hair, can eat and breathe

  @Test
  public void testChimpanzeeCanSpeak(){
    assertEquals("ooo ooo aa aa", chimpanzee.canSpeak());
  }

  @Test
  public void testChimpanzeeCanBrushHair(){
    assertEquals("I can brush my hair", chimpanzee.canBrush());
  }

}