package exception;

public class Main {

	public static void main(String[] args) {
		String word = "i'm a super-man";
		// TODO Auto-generated constructor stub
		try {
			if (word.contains("-")) {
				throw new MyException();
			}
		} catch (MyException ex) {
			System.out.println("Error!");
		}
	}

}
