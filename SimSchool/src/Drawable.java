import gpdraw.DrawingTool;

public interface Drawable {

	void draw(DrawingTool marker);
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);
	void translate(int run, int rise);
	
}
