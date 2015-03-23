package livingthings.sims;

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
}
