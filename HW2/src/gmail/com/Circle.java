package gmail.com;

public class Circle extends Shape {
	private Point pointO;
	private Point pointA;

	public Circle(Point pointO, Point pointA) {
		super();
		this.pointO = pointO;
		this.pointA = pointA;
	}

	public Circle() {
		super();
	}

	public Point getPointO() {
		return pointO;
	}

	public void setPointO(Point pointO) {
		this.pointO = pointO;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public double calculatePerimetr() {
		return 2 * Math.PI * pointO.getDistance(pointA);
	}

	public double calculateArea() {
		return Math.PI * Math.pow(pointO.getDistance(pointA), 2);
	}
}
