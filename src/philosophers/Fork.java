package philosophers;

public class Fork {
	private int id;
	private boolean taken = false;
	public boolean using() {
		return taken;
	}
	
	public int getID() {
		return id;
	}
	
	public Fork(int id){
		this.id= id;
	}

	public synchronized void take() throws InterruptedException {
		while (taken) {
			System.out.println(this + " is in use.");
			wait();
		}
		taken = true;
	}

	public synchronized void drop() {
		taken = false;
		System.out.println(this + " is free.");
		notifyAll();
	}
	public String toString() {
		return "Fork " + id;
	}
}
