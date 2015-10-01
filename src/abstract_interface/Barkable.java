package abstract_interface;

public interface Barkable {
	default public String identifyBarkable(){
		return "I can bark";
	};
}
