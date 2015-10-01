package object_class;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.toString());
		Student s2 = new Student("Việt");
		System.out.println(s2.toString());
		Student s3 = new Student("Nam", 23);
		System.out.println(s3.toString());
	}

}
