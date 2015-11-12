package thread;

public class Race {
	public static void main(String[] args) throws InterruptedException {
		Horse[] horse = new Horse[10];
		for (int i = 0; i < horse.length; i++) {
			horse[i] = new Horse(i);
		}
		
		//Start Thread
		Horse.resetRace();
		System.err.println("Race Started!");
		for (int i = 0; i < horse.length; i++)
			horse[i].start();
		System.out.printf("Horse\t      0      1      2      3      4      5      6      7      8      9\n");
		System.out.println("");
		System.out.print("Distance ");
		
		while (!Horse.isFinish()) {
			Thread.sleep(500);
			for (int i = 0; i < horse.length; i++) {
				System.out.printf("%6d ", horse[i].getDistance());
			}
			System.out.println("");
			System.out.printf("\t ");
		}
		
		System.out.println("");
		System.out.print("\r");
		System.out.print("Step number  ");
		for (int i = 0; i < horse.length; i++) {
			System.out.printf("%6d ", horse[i].getStepNum());
		}
		System.out.println("\nThe Winner is horse number " + Horse.winner() + " with " + horse[Horse.winner()].getStepNum() + " Steps");
	}
}
