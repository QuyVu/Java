package object_class;

public class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student() {
		setName("Static");
		setAge(20);
	}
	
	public Student(String s) {
		setName(s);
		setAge(21);
	}
	public Student (String s, int i) {
		setName(s);
		setAge(i);
	}
	
	public String toString(){
		return ("This is " + this.getName() + ", " + this.getAge() + " years old.");
	}

}
