package abstract_interface;

public interface Runable {
	default public String identifyRunable(){
		return "I can run";
	};
}
