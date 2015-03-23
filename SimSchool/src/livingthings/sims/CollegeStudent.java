package livingthings.sims;

import gpdraw.DrawingTool;
import shapes.Circle;

public class CollegeStudent extends Student {
	private String major;
	private int year;
	
	public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double gpa, int myYear, String myMajor) {
		super(myName, myAge, myGender, myIdNum, gpa);
		major = myMajor;
		year = myYear;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMajor(String myMajor) {
		major = myMajor;
	}
	
	public void setYear(int myYear) {
		year = myYear;
	}
	
	public String toString() {
		String s = super.toString();
		s += ", Major: " + major + ", Year: " + year;
		return s;
	}
	
	public void draw(DrawingTool marker) {
		int x = super.getX();
		int y = super.getY();
		y += 5;
		Circle g1 = new Circle (x-15, y, 5);
		Circle g2 = new Circle (x+15, y, 5);
		g1.draw(marker);
		marker.up();
		marker.move(x-10,y);
		marker.down();
		marker.move(x+10, y);
		g2.draw(marker);
	}
}
