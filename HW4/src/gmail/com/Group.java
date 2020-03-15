package gmail.com;

import java.util.Arrays;
import java.util.Comparator;

public class Group implements Voenkom {
	private Student[] groupList = new Student[10];

	public Group() {
		super();
	}

	public int countNumberOfStudent() {
		int count = 0;
		for (Student student : groupList) {
			if (student != null) {
				count++;
			}
		}
		return count;
	}

	public void addStudent(Student student) throws NumberOfStudentException {
		for (int i = 0; i < groupList.length; i++) {
			if (countNumberOfStudent() > 10) {
				throw new NumberOfStudentException();
			}
			if (groupList[i] == null) {
				groupList[i] = student;
				break;
			}
		}
	}

	public void deleteStudent(String surname) {
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] != null && groupList[i].getSurname().equals(surname)) {
				groupList[i] = null;
			}
		}
	}

	public Student findStudent(String surname) {
		for (Student student : groupList) {
			if (student != null && student.getSurname().equals(surname)) {
				return student;
			}
		}
		System.out.println("Group has less student than 10!");
		return null;

	}

	@Override
	public String toString() {
		return "Group [groupList=" + Arrays.toString(groupList) + "]";
	}

	@Override
	public Student[] getRecrut() {

		int n = 0;

		for (Student student : groupList) {
			if (student != null && student.getGender().equalsIgnoreCase("male") && student.getAge() >= 18) {
				n += 1;
			}
		}

		Student[] groupOfStudentsArrayVoencom = new Student[n];

		int i = 0;
		for (Student student : groupList) {
			if (student != null && student.getGender().equalsIgnoreCase("male") && student.getAge() >= 18) {
				groupOfStudentsArrayVoencom[i] = student;
				i = i + 1;
			}
		}
		return groupOfStudentsArrayVoencom;
	}

	public String getRecruterToString() {

		return Arrays.toString(getRecrut());
	}

}
