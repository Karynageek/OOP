package gmail.com;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Group implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	public void printGroupofStudents() {
		for (Student student : groupList) {
			System.out.println(student);
		}
	}

	@Override
	public String toString() {
		return "Group [groupList=" + Arrays.toString(groupList) + "]";
	}

}
