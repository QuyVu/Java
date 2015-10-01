package modifier;

public abstract class StaticMethod {

	public StaticMethod() {
		// TODO Auto-generated constructor stub
	}
	public static String callMe(){
		return("This is a Static method, don't need to create instance.");
	};
	
	public abstract String hello();
}
