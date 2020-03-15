package gmail.com;

public class Main {

	public static void main(String[] args) {

		Thread thr = Thread.currentThread();
		System.out.println(thr.getName() + " " + thr.getId() + " Start!");

		Thread[] threads = new Thread[100];

		for (int i = 0; i < threads.length; i++) {
			int[] mas = new int[i];
			for (int j = 0; j < mas.length; j++) {
				mas[j] = (int) Math.round(Math.random() * 100);
			}
			threads[i] = new Thread(new Sortingmas(i, mas));
			threads[i].start();
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(thr.getName() + " " + thr.getId() + " Stop!");

	}

}
