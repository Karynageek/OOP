package gmail.com;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistance(Point point) {
		return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) 
				+ Math.pow(this.getY() - point.getY(), 2));
	}
}
