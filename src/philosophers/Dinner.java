package philosophers;

public class Dinner {

	public static void main(String[] args) throws Exception {
		int size = 5;
		Fork[] fork = new Fork[size];
		Philosopher[] philosopher = new Philosopher[size];
		for (int i = 0; i < size; i++) {
			fork[i] = new Fork(i);
		}
		for (int i = 0; i < size; i++) {
			if (i < (size - 1)) {
				philosopher[i] = new Philosopher(fork[i], fork[i + 1], i);
			} else {
				philosopher[i] = new Philosopher(fork[i], fork[0], i);
			}
		}
		for (int i = 0; i < size; i++) {
			philosopher[i].start();
		}
	}

}
