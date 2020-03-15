package gmail.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Group FOAIS10 = new Group();
		try {
			FOAIS10.addStudent(new Student("Karyna", "Chelpan", "female", 20, 4, "Compute Sience", 82));
			FOAIS10.addStudent(new Student("Anya", "Grona", "female", 19, 4, "Compute Sience", 85));
			FOAIS10.addStudent(new Student("Roma", "Dudnik", "male", 17, 4, "Compute Sience", 70));
			FOAIS10.addStudent(new Student("Victor", "Gilyk", "male", 20, 4, "Compute Sience", 82));
			FOAIS10.addStudent(new Student("Vova", "Verevkin", "male", 17, 4, "Compute Sience", 69));
			FOAIS10.addStudent(new Student("Natasha", "Shmakova", "female", 20, 4, "Compute Sience", 78));
			FOAIS10.addStudent(new Student("Oksana", "Ctolar", "female", 20, 4, "Compute Sience", 82));
			FOAIS10.addStudent(new Student("Anna", "Onichenko", "female", 19, 4, "Compute Sience", 81));
			FOAIS10.addStudent(new Student("Oleg", "Ctrilchuk", "male", 18, 4, "Compute Sience", 72));
			FOAIS10.addStudent(new Student("Oleg", "Alimover", "male", 21, 4, "Compute Sience", 82));
			FOAIS10.addStudent(new Student("German", "Bolachevsky", "male", 21, 4, "Compute Sience", 90));
		} catch (NumberOfStudentException e) {
			e.printStackTrace();
		}
		FOAIS10.printGroupofStudents();
		try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("file"))) {
			OOS.writeObject(FOAIS10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Group FIT8 = null;
		try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("file"))) {
			FIT8 = (Group) OIS.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			FIT8.printGroupofStudents();
		}

	}

}
