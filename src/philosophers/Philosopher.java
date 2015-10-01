package philosophers;

import java.util.Random;

public class Philosopher extends Thread {
	private Fork left;
	private Fork right;
	private final int id;
	private Random rand = new Random(50);

	public Philosopher(Fork left, Fork right, int id) {
		// left: his fork, right: next man's fork
		this.left = left;
		this.right = right;
		this.id = id;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println(this + " thinking");
				sleep(rand.nextInt(2000));
				
				// Philosopher becomes hungry
				System.out.println(this + " grabbing Left");
				left.take();
				System.out.println(this + " grabbed Left");
				
				System.out.println(this + " grabbing Right");
				right.take();
				System.out.println(this + " grabbed Right");
				
				System.out.println(this + " eating");
				sleep(rand.nextInt(2000));
				
				left.drop();
				right.drop();
				System.out.println(this + " Done, continue thinking");
			}
		} catch (InterruptedException e) {
			System.out.println(this + " exiting via interrupt");
		}
	}

	public String toString() {
		return "Philosopher " + id;
	}

}
