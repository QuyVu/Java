package collection;

public class Exercise5 {

	public static void main(String[] args) {
		int k1 = 1;
		int k2 = 2;
		MyDictionnary<Integer, Integer, String> myD = new MyDictionnary<Integer, Integer, String>();
		myD.put(k1,k2,"good");
		System.out.println("The value of key " + k1 + " and " + k2 + " is " + myD.get(k1,k2));
		System.out.println("containKey: " + myD.containKey(k1,k2));
	}

}
