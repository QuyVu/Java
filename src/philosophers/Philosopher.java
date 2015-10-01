package philosophers;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Philosopher extends Thread{
	private Fork left;
	private Fork right;
	private final int id;
	private Random rand = new Random(47);

	private void pause() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(rand.nextInt(1500));
	}

	public Philosopher(Fork left, Fork right, int id) {
		//left: his fork, right: next man's fork
		this.left = left;
		this.right = right;
		this.id = id;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println(this + " " + "thinking");
				pause();
				// Philosopher becomes hungry
				System.out.println(this + " " + "grabbing left");
				left.take();
				System.out.println(this + " " + "grabbing right");
				right.take();
				System.out.println(this + " " + "eating");
				pause();
				right.drop();
				left.drop();
				System.out.println("Done, continue thinking");
			}
		} catch (InterruptedException e) {
			System.out.println(this + " " + "exiting via interrupt");
		}
	}

	public String toString() {
		return "Philosopher " + id;
	}

}
