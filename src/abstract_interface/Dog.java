package abstract_interface;

public class Dog extends Animal implements Barkable,Runable {

	public static void main(String[] args){
		Dog d = new Dog();
		System.out.println(d.beYou() + ", " + d.identifyBarkable() + " and " + d.identifyRunable());
	}

	@Override
	protected String beYou() {
		return "I'm a Dog";
	} 

}
