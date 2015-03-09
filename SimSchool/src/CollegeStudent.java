
public class CollegeStudent extends Student {
	private String subject;
	private double salary;
	
	public CollegeStudent(String myName, int myAge, String myGender, int myIdNum,  String myMajor, int myYear) {
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
