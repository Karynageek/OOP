package gmail.com;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Karyna", "Chelpan", "female", 20, 4, "Compute Sience", 82);
		Student student2 = new Student("Anya", "Grona", "female", 19, 4, "Compute Sience", 85);
		Student student3 = new Student("Roma", "Dudnik", "male", 20, 4, "Compute Sience", 70);
		Student student4 = new Student("Victor", "Gilyk", "male", 20, 4, "Compute Sience", 82);
		Student student5 = new Student("Vova", "Verevkin", "male", 20, 4, "Compute Sience", 69);
		Student student6 = new Student("Natasha", "Shmakova", "female", 20, 4, "Compute Sience", 78);
		Student student7 = new Student("Oksana", "Ctolar", "female", 20, 4, "Compute Sience", 82);
		Student student8 = new Student("Anna", "Onichenko", "female", 19, 4, "Compute Sience", 81);
		Student student9 = new Student("Oleg", "Ctrilchuk", "male", 20, 4, "Compute Sience", 72);
		Student student10 = new Student("Oleg", "Alimover", "male", 21, 4, "Compute Sience", 82);
		Student student11 = new Student("German", "Bolachevsky", "male", 21, 4, "Compute Sience", 90);
		Group groupCommon = new Group();
		try {
			groupCommon.addStudent(student1);
			groupCommon.addStudent(student2);
			groupCommon.addStudent(student3);
			groupCommon.addStudent(student4);
			groupCommon.addStudent(student5);
			groupCommon.addStudent(student6);
			groupCommon.addStudent(student7);
			groupCommon.addStudent(student8);
			groupCommon.addStudent(student9);
			groupCommon.addStudent(student10);
			groupCommon.addStudent(student11);

		} catch (NumberOfStudentException e) {
			e.printStackTrace();
		}
		System.out.println(groupCommon);

		groupCommon.deleteStudent("Ctolar");
		
		System.out.println(groupCommon);
		
		System.out.println(groupCommon.findStudent("Chelpan"));
		
		Student[] groupList = new Student[] { student1, student2, student3, student4, student5, student6, student7,
				student8, student9, student10 };
		
		for (Student student : groupList) {
			System.out.println(student);
		}
		System.out.println();

		Arrays.sort(groupList, new Group());

		for (Student student : groupList) {
			System.out.println(student);
		}
	}

}
