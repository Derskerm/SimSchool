import gpdraw.DrawingTool;

public interface Drawable {

	void draw(DrawingTool marker);
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);
	/**
	 * Moves the object up rise pixels and left run pixels
	 * @param run distance moved left
	 * @param rise distance moved upwards
	 */
	void translate(int run, int rise);
	
}
