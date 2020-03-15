package gmail.com;

public class Sortingmas implements Runnable {
	private int number;
	int[] mas = new int[number];

	public Sortingmas(int number, int[] mas) {
		super();
		this.number = number;
		this.mas = mas;
	}

	public Sortingmas() {
		super();
	}

	public int sortMas(int n) {
		int d = mas.length / 2;
		while (d > 0) {
			for (int i = 0; i < (mas.length - d); i++) {
				int j = i;
				while ((j >= 0) && (mas[j] > mas[j + d])) {
					int temp = mas[j];
					mas[j] = mas[j + d];
					mas[j + d] = temp;
					j--;
					return d;
				}
			}
			d = d / 2;
		}
		return d;

	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		if (thr.isInterrupted()) {
			System.out.println(thr.getName() + " Interrupted ");
			return;
		}
		System.out.println(thr.getName() + " -> " + number + sortMas(number));
	}

}
