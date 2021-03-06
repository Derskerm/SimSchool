package livingthings.sims;
import shapes.Circle;
import livingthings.LivingThing;
import gpdraw.DrawingTool;

/**
 * L.A.11.1
 *
 * The root of the Person hierarchy.  All persons have
 * a name and an age and a gender
 */

public class Person extends LivingThing
{
  private String myName ;   // name of the person
  private int myAge;        // person's age
  private String myGender;    // 'M' for male, 'F' for female
  
  // constructor
  public Person(String name, int age, String gender)
  {
    myName = name;
    myAge = age;
    myGender = gender;
  }
  
  public String getName()
  {
    return myName;
  }
  
  public int getAge()
  {
    return myAge;
  }
  
  public String getGender()
  {
    return myGender;
  }
  
  public void setName(String name)
  {
    myName = name;
  }
  
  public void setAge(int age)
  {
    myAge = age;
  }
  
  public void setGender(String gender)
  {
    myGender = gender;
  }
  
  public String toString()
  {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }

  public void draw(DrawingTool marker) {
	int x = super.getX();
	int y = super.getY();
    Circle g1 = new Circle (x-10, y, 5);
	Circle g2 = new Circle (x+10, y, 5);
	marker.up();
	marker.move(x-10,y);
	marker.down();
	g1.draw(marker);
	g2.draw(marker);
  }
}