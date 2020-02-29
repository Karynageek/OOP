package gmail.com;

public class Ball {
	private int size;
	private String color;
	private int price;
	public Ball(int size, String color, int price) {
		super();
		this.size = size;
		this.color = color;
		this.price = price;
	}
	public Ball() {
		super();
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ball [size=" + size + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
