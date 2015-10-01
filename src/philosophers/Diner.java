package philosophers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Diner {

	public static void main(String[] args) throws Exception {
		int size = 5;
		ExecutorService exec = Executors.newCachedThreadPool();
		Fork[] sticks = new Fork[size];
		for (int i = 0; i < size; i++) {
			sticks[i] = new Fork();
		}
		for (int i = 0; i < size; i++) {
			exec.execute(new Philosopher(sticks[i], sticks[(i + 1) % size], i));
		}
		System.out.println("Press 'Enter' to quit");
		System.in.read();
	}

}
