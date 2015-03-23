package livingthings.sims;

import shapes.Circle;
import gpdraw.DrawingTool;

public class Teacher extends Person {
	private String subject;
	private double salary;
	
	public Teacher(String myName, int myAge, String myGender, String mySubject, double mySalary) {
		super(myName, myAge, myGender);
		subject = mySubject;
		salary = mySalary;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSubject(String mySubject) {
		subject = mySubject;
	}
	
	public void setSalary(double mySalary) {
		salary = mySalary;
	}
	
	public String toString() {
		String s = super.toString();
		s += ", subject: " + subject + ", salary: " + salary;
		return s;
	}
	
	public void draw(DrawingTool marker) {
		int x = super.getX();
		int y = super.getY();
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
	}
}
