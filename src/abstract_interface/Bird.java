package abstract_interface;

public class Bird extends Animal implements Flyable {

	public static void main(String[] args){
		Bird b = new Bird();
		System.out.println(b.beYou() + " and " + b.identifyFlyable());
	} 

}
