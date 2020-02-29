package gmail.com;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Ball ball1 = new Ball(29, "red", 300);
		Ball ball2 = new Ball(23, "green", 330);
		Ball ball3 = new Ball(21, "red", 40);
		Ball ball4 = new Ball(5, "wthite", 600);
		Ball ball5 = new Ball(9, "blue", 90);
		
		Ball [] balls = new Ball[] {ball1, ball2, ball3, ball4, ball5};
		
		for (Ball ball: balls) {
			System.out.println(ball);
		}
		System.out.println();
		
		Arrays.sort(balls, new BallSizeCorparator());
		
		for (Ball ball: balls) {
			System.out.println(ball);
		} 
	}

}
