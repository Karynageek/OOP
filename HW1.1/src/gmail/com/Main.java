package gmail.com;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Markiza", "street cat", 2, 3, true);
		Cat cat2 = new Cat("Vasya", "home cat", 4, 4.5, true);
		Cat cat3 = new Cat("Markiza", "home cat", 1, 2, true);
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		cat1.getVoice();
	}

}
