package gmail.com;

public class Main {

	public static void main(String[] args) {
		Thread thr = Thread.currentThread();
		System.out.println(thr.getName() + " " + thr.getId() + " Start!");

		Thread[] threads = new Thread[100];
		for (int i = 0; i < threads.length; i++) {
			threads[i]=new Thread(new FactorialTask(i));
			threads[i].start();
		}
		
		System.out.println(thr.getName() + " " + thr.getId() + " Stop!");

	}

}
