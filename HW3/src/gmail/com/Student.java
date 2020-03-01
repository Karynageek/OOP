package gmail.com;

public class Student extends Human {
	private int course;
	private String specialty;
	private double averageRating;

	public Student(String name, String surname, String gender, int age, int course, String specialty,
			double averageRating) {
		super(name, surname, gender, age);
		this.course = course;
		this.specialty = specialty;
		this.averageRating = averageRating;
	}

	public Student() {
		super();
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", specialty=" + specialty + ", averageRating=" + averageRating
				+ super.toString();
	}

}
