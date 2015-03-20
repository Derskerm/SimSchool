import gpdraw.DrawingTool;


public abstract class LivingThing implements Drawable {

	int myX;
	int myY;
	
	public LivingThing() {
		myX = 0;
		myY = 0;
	}
	
	public abstract void draw(DrawingTool marker);
	
	public int getX() {
		return myX;
	}
	public int getY() {
		return myY;
	}
	public void setX(int x) {
		myX = x;
	}
	public void setY(int y) {
		myY = y;
	}
	public void translate(int run, int rise) {
		myX += run;
		myY += rise;
	}
	
}
