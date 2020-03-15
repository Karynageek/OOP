package gmail.com;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
	private int number;

	public FactorialTask(int number) {
		super();
		this.number = number;
	}

	public BigInteger fact(int n) {
		BigInteger factor = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			factor = factor.multiply(new BigInteger(Integer.toString(i)));

		}
		return factor;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
			if (thr.isInterrupted()) {
				System.out.println(thr.getName() + " Interrupted ");
				return;
			}
			System.out.println(thr.getName() + " -> " + number + " != " + fact(number));
		}

	}
