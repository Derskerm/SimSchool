package livingthings.animals;

import gpdraw.DrawingTool;

public class SerialKiller extends AbstractAnimal{
	  private String myType;
	  private String mySound;

	  public SerialKiller() {
	    myType = "serial killer";
	    mySound = "murder";
	  }

	  public String getSound() {
	  	return mySound;
	  }

	  public String getType() {
	 	return myType;
	  }

	  public String toString() {
		return "The " + getType() + " goes " + getSound();
	  }

	@Override
	public void draw(DrawingTool marker) {
		// TODO Auto-generated method stub
		
	}

}