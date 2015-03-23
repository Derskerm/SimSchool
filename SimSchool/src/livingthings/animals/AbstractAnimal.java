package livingthings.animals;

import livingthings.LivingThing;
import gpdraw.DrawingTool;

public abstract class AbstractAnimal extends LivingThing implements Animal  {

	
	public abstract void draw(DrawingTool marker);

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	public void translate(int run, int rise) {
		// TODO Auto-generated method stub
		
	}

	public String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
