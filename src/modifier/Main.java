package modifier;

public class Main extends StaticMethod {
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(StaticMethod.callMe());
		System.out.println(m.hello());
	}

	@Override
	public String hello() {
		return "Override from superclass.";
	}

}
