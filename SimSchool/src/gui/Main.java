package gui;
import livingthings.sims.CollegeStudent;
import livingthings.sims.Person;
import livingthings.sims.Student;
import livingthings.sims.Teacher;
import gpdraw.DrawingTool;
import gpdraw.SketchPad;


public class Main {
	
	public static void main (String[] args) {
		SketchPad pad = new SketchPad(400, 400);
		DrawingTool marker = new DrawingTool(pad);
		Person bob = new Person("Coach Bob", 27, "M");
		System.out.println(bob);

		Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
		System.out.println(lynne);

		Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
		System.out.println(mrJava);

		CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
		System.out.println(ima);
		
		Drawer drawer = new Drawer(marker);
		drawer.Draw(bob, -75, 75);
		drawer.Draw(lynne, 75, 75);
		drawer.Draw(mrJava, -75, -75);
		drawer.Draw(ima, 75, -75);

	}
	
}
