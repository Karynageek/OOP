package gmail.com;

import java.util.Arrays;
import java.util.Comparator;

public class Group implements Comparator<Object> {
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
}
