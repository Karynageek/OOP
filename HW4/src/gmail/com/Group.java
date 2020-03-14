package gmail.com;

import java.util.Arrays;
import java.util.Comparator;

public class Group implements Comparator<Object>, Voenkom {
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
	public int compare(Object obj1, Object obj2) {
		if (obj1 == obj2) {
			return 0;
		}
		if (obj1 == null) {
			return -1;
		}
		if (obj2 == null) {
			return 1;
		}
		Student a = (Student) obj1;
		Student b = (Student) obj2;
		return (a.getSurname().compareTo(b.getSurname()));
	}

	public int compare(Object obj1, Object obj2, Object obj3, Object obj4) {
		if (obj1 != null && obj2 == null && obj4 == null) {
			return 1;
		}
		if (obj1 == null && obj2 != null && obj3 == null) {
			return -1;
		}
		if (obj1 == null && obj2 == null && obj3 == obj4) {
			return 0;
		}

		Student a = (Student) obj1;
		Student b = (Student) obj2;
		Student c = (Student) obj3;
		Student d = (Student) obj4;

		if (a.getAverageRating() > b.getAverageRating()) {
			return 1;
		}
		if (a.getAverageRating() < b.getAverageRating()) {
			return -1;
		}
		return (c.getSurname().compareTo(d.getSurname()));
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
