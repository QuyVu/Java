package abstract_interface;

public class Car extends Machine implements Runable {

	public Car(){
		System.out.println("I have 4 wheels");
	}
	
	public static void main(String[] args){
		Car c = new Car();
		System.out.println(c.beYou() + ", " + c.identifyRunable());
	}

	@Override
	protected String beYou() {
		return "I'm a car";
	} 

}
