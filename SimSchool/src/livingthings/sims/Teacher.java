package livingthings.sims;

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
}
