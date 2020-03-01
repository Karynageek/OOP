package gmail.com;

public class Cat {
	private String name;
	private String type;
	private int age;
	private double weigt;
	private boolean sex;
	public Cat(String name, String type, int age, double weigt, boolean sex) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.weigt = weigt;
		this.sex = sex;
	}
	public Cat() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeigt() {
		return weigt;
	}
	public void setWeigt(double weigt) {
		this.weigt = weigt;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", age=" + age + ", weigt=" + weigt + ", sex=" + sex + "]";
	}
	public void getVoice() {
		System.out.println("Meow");
	}
}
