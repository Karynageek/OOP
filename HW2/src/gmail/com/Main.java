package gmail.com;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(new Point(3, 4), new Point(5, 2), new Point(2, 1));
		Circle circle = new Circle(new Point(2, 1), new Point(1, 6));
		System.out.println(triangle.calculatePerimetr());
		System.out.println(triangle.calculateArea());
		System.out.println(circle.calculatePerimetr());
		System.out.println(circle.calculateArea());
	}

}
