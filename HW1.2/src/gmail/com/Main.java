package gmail.com;

public class Main {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(2.4, 5, 3);
		Triangle triangle2 = new Triangle(2, 3, 2);
		Triangle triangle3 = new Triangle(8.7, 5.8, 7.9);
		System.out.println(triangle1);
		System.out.println(triangle1.calculateArea());
		System.out.println(triangle2);
		System.out.println(triangle2.calculateArea());
		System.out.println(triangle3);
		System.out.println(triangle3.calculateArea());

	}

}
