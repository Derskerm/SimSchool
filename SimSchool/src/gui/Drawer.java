package gui;
import livingthings.sims.CollegeStudent;
import livingthings.sims.Person;
import livingthings.sims.Student;
import livingthings.sims.Teacher;
import gpdraw.DrawingTool;
import shapes.*;

public class Drawer {
	DrawingTool marker;
	
	public Drawer(DrawingTool myMarker) {
		marker = myMarker;
	}
	
	public void Draw(Person p, int x, int y) {
		Circle c = new Circle(x, y, 50);
		c.draw(marker);
		if (p instanceof CollegeStudent) {
			y+=5;
			Circle g1 = new Circle (x-15, y, 5);
			Circle g2 = new Circle (x+15, y, 5);
			g1.draw(marker);
			marker.up();
			marker.move(x-10,y);
			marker.down();
			marker.move(x+10, y);
			g2.draw(marker);
		} else if (p instanceof Student) {
			y += 5;
			marker.up();
			marker.move(x-15, y);
			marker.down();
			marker.drawRect(10, 10);
			marker.up();
			marker.move(x-10,y);
			marker.down();
			marker.move(x+10, y);
			marker.up();
			marker.move(x+15, y);
			marker.down();
			marker.drawRect(10, 10);
		} else if (p instanceof Teacher) {
			Circle g1 = new Circle (x-10, y, 5);
			Circle g2 = new Circle (x+10, y, 5);
			g1.draw(marker);
			marker.up();
			marker.move(x-5,y);
			marker.down();
			marker.move(x+5,y);
			g2.draw(marker);
			marker.up();
			marker.move(x-15,y-20);
			marker.down();
			marker.move(x-5, y-15);
			marker.up();
			marker.move(x+15,y-20);
			marker.down();
			marker.move(x+5, y-15);
		} else {
			Circle g1 = new Circle (x-10, y, 5);
			Circle g2 = new Circle (x+10, y, 5);
			marker.up();
			marker.move(x-10,y);
			marker.down();
			g1.draw(marker);
			g2.draw(marker);
		}
	}
}
