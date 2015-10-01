package thread;

public class Horse extends Thread {

	private static final int LENGTH = 100;
	private static boolean raceOver = false;
	private static int winnerID = 0;
	private int id;
	private int stepNum;
	private int distance;
	
	public Horse(int id) {
		this.id = id;
		this.stepNum = 0;
		this.distance = 0;
	}
	
	public int getID() {
		return id;
	}

	public int getStepNum() {
		return stepNum;
	}

	public int getDistance() {
		return distance;
	}

	public static void resetRace() {
		raceOver = false;
	}

	public static boolean isFinish() {
		return raceOver;
	}

	public static int winner() {
		return winnerID;
	}

	public void run() {
		while (!raceOver) {
			try {
				Thread.sleep(500);
				int step = (int) (Math.random() * 10 + 1);
				stepNum += 1;
				distance += step;
				if (getDistance() == LENGTH) {
					raceOver = true;
					winnerID = id;
				} else if (distance > LENGTH)
					distance -= LENGTH;
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

}
