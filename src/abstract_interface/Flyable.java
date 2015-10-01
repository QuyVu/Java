package abstract_interface;

public interface Flyable {
	default public String identifyFlyable(){
		return "I can fly";
	};
}
