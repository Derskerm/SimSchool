package gui;

import java.util.ArrayList;

import livingthings.animals.Animal;
import livingthings.animals.Chick;
import livingthings.animals.Cow;
import livingthings.animals.SerialKiller;
import livingthings.animals.Pig;

public class Farm {
  private ArrayList<Animal> myFarm = new ArrayList<Animal>();

  public Farm(){
    myFarm.add(new Cow());
    myFarm.add(new Chick());
    myFarm.add(new Pig());
    myFarm.add(new SerialKiller());
  }

  // This method prints out the result of each animal's toString() method to the command
  // line window.
  public void printAnimalSounds() {
	StringBuffer sb = new StringBuffer();
    for (Animal a : myFarm) {
    	sb.append(a.getSound());
    }
    System.out.println(sb);
  }

  // This method prints out the lyrics to OldMacDonald, including all animals in the farm.
  public void printOldMacDonaldSong() {
	for (Animal a : myFarm) {
		System.out.println("Old MacDonald had a farm!");
		System.out.println("E-I-E-I-O!");
		System.out.println("And on that farm he had a " + a.getType() +"!");
		System.out.println("E-I-E-I-O!");
		System.out.println("With a " + a.getSound() + " " + a.getSound() + " here,");
		System.out.println("and a " + a.getSound() + " " + a.getSound() + " there,");
		System.out.println("here a " + a.getSound() + ", there a " + a.getSound() + ",");
		System.out.println("everywhere a " + a.getSound() + " " + a.getSound() + "!");
		System.out.println("Old MacDonald had a farm!");
		System.out.println("E-I-E-I-O!");
	}
  }
}
