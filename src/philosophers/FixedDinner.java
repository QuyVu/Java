package philosophers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedDinner {

	public static void main(String[] args) throws Exception {
		int size = 5;
		ExecutorService exec = Executors.newCachedThreadPool();
		Fork[] sticks = new Fork[size];
		for (int i = 0; i < size; i++) {
			sticks[i] = new Fork();
		}
		for (int i = 0; i < size; i++) {
			if (i < (size - 1)) {
				exec.execute(new Philosopher(sticks[i], sticks[i + 1], i));
			} else {
				exec.execute(new Philosopher(sticks[0], sticks[i], i));
			}
		}
		System.out.println("Press 'Enter' to quit");
		System.in.read();
		exec.shutdownNow();
	}

}
