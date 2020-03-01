package gmail.com;

public class Triangle extends Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Triangle() {
		super();
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public double calculatePerimetr() {
		double p = pointA.getDistance(pointB) + pointB.getDistance(pointC) + pointC.getDistance(pointA);
		return p;
	}

	@Override
	public double calculateArea() {
		double halfP = calculatePerimetr() / 2;
		return Math.sqrt(halfP * (halfP - pointA.getDistance(pointB)) * (halfP - pointB.getDistance(pointC))
				* (halfP - pointC.getDistance(pointA)));
	}
}