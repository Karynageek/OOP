package gmail.com;

import java.io.Serializable;

public class Human implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private String gender;
	private int age;

	public Human(String name, String surname, String gender, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.age = age;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", surname=" + surname + ", gender=" + gender + ", age=" + age + "]";
	}

}
