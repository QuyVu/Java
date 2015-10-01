package loop_selection;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void printMenu() {
		System.out.println("MENU");
		System.out.println("1. Option 1");
		System.out.println("2. Option 2");
		System.out.println("3. Option 3");
		System.out.println("4. Exit");
		// TODO Auto-generated constructor stub
	}

	public static int optionOne() {
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		return sum;
	}

	public static int optionTwo() {
		int sum=0;
		int i = 0;
		while (i < 10) {
			sum += i;
			i++;
		}
		return sum;
	}

	public static String optionThree() {
		Random rand = new Random();
		int sum = rand.nextInt(50) + 1;
		if (sum % 2 == 0)
			return (sum + " is an even number");
		else
			return (sum + " is an odd number");
	}

	public static void main(String[] args) {
		int c = 0;
		Scanner s = new Scanner(System.in);
		do {
			printMenu();
			System.out.print("Enter your choice: ");
			c = s.nextInt();
			switch (c) {
			case 1:
				System.out.println(optionOne());
				break;
			case 2:
				System.out.println(optionTwo());
				break;
			case 3:
				System.out.println(optionThree());
				break;
			}
		} while (c != 4);
		s.close();
	}

}
